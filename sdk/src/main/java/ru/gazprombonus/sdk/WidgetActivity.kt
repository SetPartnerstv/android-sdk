package ru.gazprombonus.sdk

import android.annotation.TargetApi
import android.content.ActivityNotFoundException
import android.content.Intent
import android.content.pm.PackageManager
import android.content.pm.ResolveInfo
import android.graphics.Bitmap
import android.graphics.Rect
import android.net.Uri
import android.net.http.SslError
import android.os.Build
import android.os.Bundle
import android.os.Environment
import android.provider.MediaStore
import android.util.Log
import android.view.KeyEvent
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import android.webkit.HttpAuthHandler
import android.webkit.PermissionRequest
import android.webkit.SslErrorHandler
import android.webkit.URLUtil
import android.webkit.ValueCallback
import android.webkit.WebChromeClient
import android.webkit.WebResourceError
import android.webkit.WebResourceRequest
import android.webkit.WebResourceResponse
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.FileProvider
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import ru.gazprombonus.sdk.handlers.ClipboardWriteEventHandler
import ru.gazprombonus.sdk.handlers.DefaultGooglePayEventHandler
import ru.gazprombonus.sdk.handlers.MobileEventHandler
import ru.gazprombonus.sdk.handlers.OpenUrlEventHandler
import ru.gazprombonus.sdk.handlers.ShareUrlEventHandler
import ru.gazprombonus.sdk.model.MobileEvent
import ru.gazprombonus.sdk.model.MobileEventType
import java.io.File
import java.net.URI
import java.net.URISyntaxException
import java.text.SimpleDateFormat
import java.util.Date


private const val BASE_URL = BuildConfig.BASE_URL
// private const val RECORD_AUDIO_REQUEST_CODE = 1
private const val INPUT_FILE_REQUEST_CODE = 3
private const val CAMERA_REQUEST_CODE = 4
// private const val RESOURCE_AUDIO_CAPTURE = "android.webkit.resource.AUDIO_CAPTURE"

open class WidgetActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_TOKEN = "EXTRA_TOKEN"
        const val EXTRA_BASE_URL = "EXTRA_BASE_URL"
        const val EXTRA_HTTP_USERNAME = "EXTRA_HTTP_USERNAME"
        const val EXTRA_HTTP_PASSWORD = "EXTRA_HTTP_PASSWORD"
        const val EXTRA_QUERY_PARAMS = "EXTRA_QUERY_PARAMS"
        const val EXTRA_APP_JSCODE = ""

        const val RESULT_ERROR = 100
    }

    protected val handlers = mutableListOf<MobileEventHandler>()
    protected lateinit var webView: WebView
    protected lateinit var jsBridge: JSBridge
    protected lateinit var baseUrl: String
    private var httpUsername: String? = null
    private var httpPassword: String? = null
    private var permissionRequest: PermissionRequest? = null
    private var filePathCallback: ValueCallback<Array<Uri>>? = null
    private var cameraPhotoPath: String? = null
    private var httpError = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_widget)

        val token = intent.getStringExtra(EXTRA_TOKEN)

        baseUrl = intent.getStringExtra(EXTRA_BASE_URL) ?: BASE_URL
        httpUsername = intent.getStringExtra(EXTRA_HTTP_USERNAME)
        httpPassword = intent.getStringExtra(EXTRA_HTTP_PASSWORD)

        webView = findViewById<WebView>(R.id.web_view).apply {
            settings.javaScriptEnabled = true
            settings.allowContentAccess = true
            settings.allowFileAccess = true
            settings.domStorageEnabled = true
            settings.javaScriptCanOpenWindowsAutomatically = true

            webViewClient = WidgetWebViewClient()
            webChromeClient = WidgetWebChromeClient()
        }
        jsBridge = JSBridge(
            webView = webView,
            eventListener = ::handleEvent,
            navigationStateChange = ::handleNavigation,
            extraJSCode = intent.getStringExtra(EXTRA_APP_JSCODE) ?: "",
            widget = this,
        )

        val url = Uri.parse(baseUrl).buildUpon().run {
            if (!token.isNullOrBlank()) {
                appendQueryParameter("token", token)
            }

            (intent.getSerializableExtra(EXTRA_QUERY_PARAMS) as? HashMap<String, String>)
                ?.forEach {
                    appendQueryParameter(it.key.lowercase(), it.value)
                }

            toString()
        }

        webView.loadUrl(url)
        setResult(RESULT_OK)

        if (BuildConfig.DEBUG) {
            Log.d("[GPBonusWidget]", "init; url: $url;")
        }

        val rootView = window.decorView.findViewById<View>(android.R.id.content)
        val containerView = (webView.parent as View)

        // GBoard autofill workaround
        rootView?.viewTreeObserver?.addOnGlobalLayoutListener {
            try {
                val rect = Rect().apply {
                    window.decorView.getWindowVisibleDisplayFrame(this)
                }

                containerView.layoutParams = containerView.layoutParams.apply {
                    height = rect.height()
                }
            } catch (e: Throwable) {
                Log.e("[GPBonusWidget]", "Container resize error", e)
            }
        }

        handlers.add(OpenUrlEventHandler(this))
        handlers.add(ShareUrlEventHandler(this))
        handlers.add(ClipboardWriteEventHandler(this))
        handlers.add(DefaultGooglePayEventHandler(jsBridge))
    }

    override fun onKeyDown(keyCode: Int, keyEvent: KeyEvent?): Boolean {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            if (isWidgetUrl(webView.url) && !httpError) {
                val event = MobileEvent.newBuilder().run {
                    type = MobileEventType.MOBILE_EVENT_BACK
                    build()
                }

                jsBridge.send(event)
                return true
            }

            if (webView.canGoBack()) {
                webView.goBack()
                return true
            }
        }

        return super.onKeyDown(keyCode, keyEvent)
    }

    @TargetApi(Build.VERSION_CODES.M)
    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        when (requestCode) {
            /* RECORD_AUDIO_REQUEST_CODE -> {
                if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    permissionRequest?.grant(arrayOf(RESOURCE_AUDIO_CAPTURE))
                } else {
                    permissionRequest?.deny()
                }
            } */
            CAMERA_REQUEST_CODE -> startActionChooser()
            else -> super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        when (requestCode) {
            INPUT_FILE_REQUEST_CODE -> {
                if (resultCode == RESULT_OK) {
                    val result = if (data == null || data.dataString == null) {
                        cameraPhotoPath?.let { arrayOf(Uri.parse(it)) }
                    } else {
                        arrayOf(Uri.parse(data.dataString))
                    }

                    filePathCallback?.onReceiveValue(result)
                } else {
                    filePathCallback?.onReceiveValue(null)
                }

                filePathCallback = null
            }
            else -> super.onActivityResult(requestCode, resultCode, data)
        }
    }

    /* @TargetApi(Build.VERSION_CODES.M)
    private fun requestMicrophone(request: PermissionRequest) {
        requestPermissions(arrayOf(android.Manifest.permission.RECORD_AUDIO), RECORD_AUDIO_REQUEST_CODE)
        permissionRequest = request
    } */

    private fun handleEvent(event: MobileEvent) {
        handlers.find {
            it.handle(event)
        } ?: Log.i("[GPBonusWidget]", "Unhandled event type: ${event.type}")
    }

    private fun handleNavigation() {
        webView.post {
            if (webView.url?.endsWith("/escape") == true) {
                finish()
            }
        }
    }

   private fun getAuthority(): String = application.packageName + getString(R.string.provider_package)

    private fun startActionChooser() {
        var cameraIntent: Intent? = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        if (hasCameraPermission() && cameraIntent!!.resolveActivity(packageManager) != null) {
            // Create the File where the photo should go
            val photoFile: File? = try {
                createImageFile()
            } catch (ex: Throwable) {
                Log.e("[GPBonusWidget]", "Unable to create Image File", ex)
                null
            }

            // Continue only if the File was successfully created
            if (photoFile != null) {
                val fileUri = FileProvider.getUriForFile(this, getAuthority(), photoFile)
                cameraPhotoPath = "file:" + photoFile.absolutePath
                cameraIntent.putExtra(MediaStore.EXTRA_OUTPUT, fileUri)
//                cameraIntent.putExtra("PhotoPath", cameraPhotoPath)

                val resInfoList: List<ResolveInfo> = packageManager.queryIntentActivities(cameraIntent, PackageManager.MATCH_DEFAULT_ONLY)
                for (resolveInfo in resInfoList) {
                    val packageName = resolveInfo.activityInfo.packageName
                    grantUriPermission(packageName, fileUri, Intent.FLAG_GRANT_WRITE_URI_PERMISSION or Intent.FLAG_GRANT_READ_URI_PERMISSION)
                }
            } else {
                cameraIntent = null
            }
        }

        val contentSelectionIntent = Intent(Intent.ACTION_GET_CONTENT)
        contentSelectionIntent.addCategory(Intent.CATEGORY_OPENABLE)
        contentSelectionIntent.type = "image/*"

        val intentArray = cameraIntent?.let { arrayOf(it) } ?: emptyArray()

        val chooserIntent = Intent(Intent.ACTION_CHOOSER)
        chooserIntent.putExtra(Intent.EXTRA_INTENT, contentSelectionIntent)
        chooserIntent.putExtra(Intent.EXTRA_TITLE, "Image Chooser")
        chooserIntent.putExtra(Intent.EXTRA_INITIAL_INTENTS, intentArray)

        startActivityForResult(chooserIntent, INPUT_FILE_REQUEST_CODE)
    }

    private fun hasCameraPermission(): Boolean = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
        checkSelfPermission(android.Manifest.permission.CAMERA) == PackageManager.PERMISSION_GRANTED &&
        checkSelfPermission(android.Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED &&
        checkSelfPermission(android.Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED
    } else {
        true
    }

    private fun openFileChooser(callback: ValueCallback<Array<Uri>>?): Boolean {
        try {
            filePathCallback?.onReceiveValue(null)
            filePathCallback = callback

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M && !hasCameraPermission()) {
                val permissions = arrayOf(
                        android.Manifest.permission.CAMERA,
                        android.Manifest.permission.READ_EXTERNAL_STORAGE,
                        android.Manifest.permission.WRITE_EXTERNAL_STORAGE
                )
                requestPermissions(permissions, CAMERA_REQUEST_CODE)
            } else {
                startActionChooser()
            }

            return true
        } catch (e: Throwable) {
            filePathCallback = null
        }

        return false
    }

    private fun createImageFile(): File? {
        // Create an image file name
        val timeStamp = SimpleDateFormat("yyyyMMdd_HHmmss").format(Date())
        val imageFileName = "JPEG_${timeStamp}_"
        val dir = getExternalFilesDir(Environment.DIRECTORY_PICTURES)
        return File.createTempFile(imageFileName, ".jpg", dir)
    }

    private fun getDomainName(url: String): String {
      return if (URLUtil.isValidUrl(url)) {
          val uri = URI(url)
          val domain: String = uri.host
        domain.removePrefix("www.")
      } else {
        ""
      }
    }

    private fun isWidgetUrl(url: String?): Boolean = url?.let {
        it.startsWith(baseUrl, true) || getDomainName(it).contains("widget.gazprombonus.ru", true) || getDomainName(it).contains("widget.ogon.ru", true)
    } ?: false

    private inner class WidgetWebViewClient : WebViewClient() {
        override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {
            super.onPageStarted(view, url, favicon)

            if (BuildConfig.DEBUG) {
                Log.d("[GPBonusWidget]", "onPageStarted; url: $url")
            }

            if (isWidgetUrl(url)) {
                jsBridge.injectJsCode()
            }
        }

        override fun onPageFinished(view: WebView?, url: String?) {
            if (httpError && view?.canGoBack() != true && callingActivity != null) {
                setResult(RESULT_ERROR)
                finish()
            } else {
                super.onPageFinished(view, url)
            }
        }

        override fun onReceivedSslError(view: WebView?, handler: SslErrorHandler?, error: SslError?) {
            if (BuildConfig.DEBUG) { // handle local ssl
                handler?.proceed()
            } else {
                super.onReceivedSslError(view, handler, error)
            }
        }

        override fun onReceivedHttpError(view: WebView?, request: WebResourceRequest?, errorResponse: WebResourceResponse?) {
            if (request !== null && Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                if (request.method.equals("get", true) && request.isForMainFrame) {
                    httpError =
                        !(errorResponse?.statusCode == 401 && errorResponse.responseHeaders["server"].equals("qrator", true))
                }
            }

            super.onReceivedHttpError(view, request, errorResponse)
        }

        override fun onReceivedError(view: WebView?, request: WebResourceRequest?, error: WebResourceError?) {
            if (request !== null && Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                if (request.method.equals("get", true) && request.isForMainFrame) {
                    httpError = true
                }
            }

            super.onReceivedError(view, request, error)
        }

        override fun onReceivedHttpAuthRequest(view: WebView?, handler: HttpAuthHandler?, host: String?, realm: String?) {
            if (httpUsername.isNullOrEmpty() || httpPassword.isNullOrEmpty()) {
                super.onReceivedHttpAuthRequest(view, handler, host, realm)
            } else {
                handler?.proceed(httpUsername, httpPassword)
            }
        }

        override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean {
            if (url.startsWith("intent://") ) {
                try {
                    val context = view.context
                    val intent = Intent.parseUri(url, Intent.URI_INTENT_SCHEME)
                    if (intent != null) {
                        view.stopLoading()
                        val packageManager = context.packageManager
                        try {
                            // trying to open app
                            context.startActivity(intent)
                        } catch (e: ActivityNotFoundException) {
                            val fallbackUrl = intent.getStringExtra("browser_fallback_url")
                           val packageName = intent.`package`
                            try {
                                // trying to open playmarket app
                                val browserIntent =  Intent(Intent.ACTION_VIEW, Uri.parse(fallbackUrl))
                                context.startActivity(browserIntent)
                            } catch (e: ActivityNotFoundException) {
                                // trying to open playmarket web link
                                context.startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=$packageName")))
                            }
                        }
                        return true
                    }
                } catch (e: URISyntaxException) {
                    Log.e("[GPBonusWidget]", "Can't resolve intent://", e)
                }
            } else if (url?.startsWith("tel:") == true) {
                val intent = Intent(Intent.ACTION_DIAL)
                intent.data = Uri.parse(url)
                view?.context?.startActivity(intent)
                return true
            } else if (url.startsWith("mailto:")) {
              var email = url.split(":");
              val emailIntent = Intent(android.content.Intent.ACTION_SEND);
              emailIntent.setType("text/plain");
              emailIntent.putExtra(android.content.Intent.EXTRA_EMAIL, arrayOf(email[1]));
              emailIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "");
              view?.context?.startActivity(emailIntent);
              return true
            } else if (url.startsWith("https://")) {
              val currentHostUri = Uri.parse(view.url)
              val currentHost = currentHostUri.host
              val uri = Uri.parse(url)
              val newHost = uri.host
              val cast_external_browser = uri.getQueryParameter("cast_external_browser")
              if (cast_external_browser.toBoolean()) {
                if (currentHost!!.contains("gazprombank.ru") && newHost!!.equals("pay.mironline.ru")) {
                  val intent =  Intent(Intent.ACTION_VIEW, uri)
                  try {
                    view.context.startActivity(intent)
                    return  true
                  } catch (e: ActivityNotFoundException) {
                    Log.e("[GPBonusWidget]", "ActivityNotFoundException ", e)
                    return false
                  }
                }
              }
            }
            /* } else if (url.startsWith("market://")) {
                val context = view.context
                view.stopLoading()
                try {
                    val browserIntent =  Intent(Intent.ACTION_VIEW, Uri.parse(url))
                    context.startActivity(browserIntent)
                } catch (e: ActivityNotFoundException) {
                    context.startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=$packageName")))
                }
            } */
            return false
        }
    }

    private inner class WidgetWebChromeClient : WebChromeClient() {
        @TargetApi(Build.VERSION_CODES.M)
        override fun onPermissionRequest(request: PermissionRequest?) {
            request?.apply {
                resources.forEach { resource ->
                    when (resource) {
                        // RESOURCE_AUDIO_CAPTURE -> requestMicrophone(request)
                    }
                }
            }
        }

        override fun onShowFileChooser(webView: WebView?, callback: ValueCallback<Array<Uri>>?, params: FileChooserParams?): Boolean {
            return openFileChooser(callback)
        }


        //////// FULL SCREEN MODE
        var layoutParams = LinearLayout.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.MATCH_PARENT
        )

        var parent: ViewGroup? = findViewById(android.R.id.content)
        var customView: View? = null

        override fun onShowCustomView(view: View?, callback: CustomViewCallback?) {
            super.onShowCustomView(view, callback)
            window.apply {
                clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
                addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R && view != null) {
                    WindowCompat.setDecorFitsSystemWindows(window, false)
                    val controller = WindowInsetsControllerCompat(window, view)
                    controller.hide(WindowInsetsCompat.Type.systemBars())
                    controller.systemBarsBehavior =
                        WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
                } else {
                    val decorView = window.decorView
                    @Suppress("DEPRECATION")
                    val uiOptions = (View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                            or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                            or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                            or View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                            or View.SYSTEM_UI_FLAG_FULLSCREEN)
                    @Suppress("DEPRECATION")
                    decorView.systemUiVisibility = uiOptions
                }
            }
            customView = view;
            view?.setLayoutParams(layoutParams);
            parent?.addView(view);
        }

        override fun onHideCustomView() {
            super.onHideCustomView()

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R && customView != null) {
                WindowCompat.setDecorFitsSystemWindows(window, true)
                customView?.let {
                    WindowInsetsControllerCompat(
                        window,
                        it
                    ).show(WindowInsetsCompat.Type.systemBars())
                }
            } else {
                @Suppress("DEPRECATION")
                window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_VISIBLE;
            }

            parent?.removeView(customView);
            customView = null;
        }

    }

}