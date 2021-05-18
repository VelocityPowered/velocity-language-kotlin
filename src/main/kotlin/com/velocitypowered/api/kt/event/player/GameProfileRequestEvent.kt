package com.velocitypowered.api.kt.event.player

import com.velocitypowered.api.event.player.GameProfileRequestEvent
import com.velocitypowered.api.proxy.connection.InboundConnection
import com.velocitypowered.api.util.GameProfile

val GameProfileRequestEvent.connection: InboundConnection
  inline get() = connection()

val GameProfileRequestEvent.username: String
  inline get() = username()

val GameProfileRequestEvent.initialProfile: GameProfile
  inline get() = initialProfile()

var GameProfileRequestEvent.gameProfile: GameProfile
  inline get() = gameProfile()
  inline set(value) {
    setGameProfile(value)
  }
