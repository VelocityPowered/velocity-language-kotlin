package com.velocitypowered.api.kt.event.player

import com.velocitypowered.api.event.player.PlayerChatEvent
import com.velocitypowered.api.proxy.connection.Player

inline val PlayerChatEvent.player: Player
  get() = player()

inline val PlayerChatEvent.originalMessage: String
  get() = originalMessage()

inline var PlayerChatEvent.currentMessage: String
  get() = currentMessage()
  set(value) {
    setCurrentMessage(value)
  }
