package ru.gazprombonus.sdk.handlers

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import ru.gazprombonus.sdk.model.MobileEvent
import ru.gazprombonus.sdk.model.MobileEventType


class ClipboardWriteEventHandler(private val context: Context) : MobileEventHandler {
    override fun handle(event: MobileEvent): Boolean = event.takeIf {
        it.type == MobileEventType.MOBILE_EVENT_CLIPBOARD_WRITE
    }?.let {
        val clipboard = context.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
        val clip = ClipData.newPlainText("", it.clipboardWrite)
        clipboard.setPrimaryClip(clip)

        true
    } ?: false
}