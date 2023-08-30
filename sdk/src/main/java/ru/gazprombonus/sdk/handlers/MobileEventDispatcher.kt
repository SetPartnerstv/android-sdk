package ru.gazprombonus.sdk.handlers

import ru.gazprombonus.sdk.model.MobileEvent

interface MobileEventDispatcher {
    fun send(event: MobileEvent)
}