package ru.gazprombonus.sdk.handlers

import android.app.Activity
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import ru.gazprombonus.sdk.model.MobileEvent
import ru.gazprombonus.sdk.model.MobileEventType


class BrightnessEventHandler(private val context: Context) : MobileEventHandler {
    override fun handle(event: MobileEvent): Boolean = event.takeIf {
        it.type == MobileEventType.MOBILE_EVENT_BRIGHTNESS_CHANGE
    }?.let {
        val activity = context as AppCompatActivity
        activity.let {it1 ->
            it1.runOnUiThread(Runnable {
                if (event.brightness > 0) {
                    setWindowBrightness(it1, event.brightness / 100.0f)
                } else {
                    setWindowBrightness(it1, -1.0f)
                }
            })
        }
        true
    } ?: false


    fun setWindowBrightness(activity: AppCompatActivity, brightness: Float) {
        val lp = activity.window.attributes
        lp.screenBrightness = if (brightness > 0.0f)  brightness.coerceIn(0.0f, 1.0f) else -1.0f
        activity.window.attributes = lp
    }
}
