package ru.gazprombonus.sdktest

import android.content.Intent
import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Gravity
import android.view.View
import android.webkit.WebView
import android.widget.Button
import android.widget.FrameLayout
import android.widget.TextView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import ru.gazprombonus.sdk.WidgetActivity

private const val SDK_REQUEST_CODE = 1

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
           window.setDecorFitsSystemWindows(false)
        } else {
            window.decorView.systemUiVisibility = (
                    View.SYSTEM_UI_FLAG_LAYOUT_STABLE or
                            View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN or
                            View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                    )
        }
        setContentView(R.layout.activity_main)

        val versionTextView = findViewById<TextView>(R.id.sdkVersion)
        versionTextView.text = "SDK Version: ${BuildConfig.VERSION_NAME}"

        findViewById<Button>(R.id.button).apply {
            setOnClickListener {
                val intent = Intent(this@MainActivity, WidgetActivity::class.java).apply {
                    putExtra(WidgetActivity.EXTRA_BASE_URL, "https://widget.gazprombonus.ru")
//                    putExtra(WidgetActivity.EXTRA_GOOGLE_PAY_ENABLED, true)
                }

                startActivityForResult(intent, SDK_REQUEST_CODE)
            }
        }

        findViewById<Button>(R.id.buttonst).apply {
            setOnClickListener {
                val intent = Intent(this@MainActivity, WidgetActivity::class.java).apply {
                    putExtra(WidgetActivity.EXTRA_BASE_URL, "https://st-widget.gazprombonus.ru")
                }

                startActivityForResult(intent, SDK_REQUEST_CODE)
            }
        }

        WebView.setWebContentsDebuggingEnabled(true)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode == SDK_REQUEST_CODE) {
            Log.i("[SDK]", "resultCode: $resultCode")
        }
        super.onActivityResult(requestCode, resultCode, data)
    }
}