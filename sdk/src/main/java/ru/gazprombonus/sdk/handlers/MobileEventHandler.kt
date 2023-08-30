package ru.gazprombonus.sdk.handlers

import ru.gazprombonus.sdk.model.MobileEvent

interface MobileEventHandler {
    fun handle(event: MobileEvent): Boolean
}