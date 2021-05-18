package com.velocitypowered.api.kt.event.player

import com.velocitypowered.api.event.player.PlayerChatEvent
import com.velocitypowered.api.proxy.connection.Player

val PlayerChatEvent.player: Player
  inline get() = player()

val PlayerChatEvent.originalMessage: String
  inline get() = originalMessage()

var PlayerChatEvent.currentMessage: String
  inline get() = currentMessage()
  inline set(value) {
    setCurrentMessage(value)
  }
