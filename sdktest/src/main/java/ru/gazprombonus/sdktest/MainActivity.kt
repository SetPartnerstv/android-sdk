package ru.gazprombonus.sdktest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.webkit.WebView
import android.widget.Button
import ru.gazprombonus.sdk.WidgetActivity

private const val SDK_REQUEST_CODE = 1

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

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