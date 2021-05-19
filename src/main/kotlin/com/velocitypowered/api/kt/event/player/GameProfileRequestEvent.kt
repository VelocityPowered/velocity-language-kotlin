package com.velocitypowered.api.kt.event.player

import com.velocitypowered.api.event.player.GameProfileRequestEvent
import com.velocitypowered.api.proxy.connection.InboundConnection
import com.velocitypowered.api.util.GameProfile

inline val GameProfileRequestEvent.connection: InboundConnection
  get() = connection()

inline val GameProfileRequestEvent.username: String
  get() = username()

inline val GameProfileRequestEvent.initialProfile: GameProfile
  get() = initialProfile()

inline var GameProfileRequestEvent.gameProfile: GameProfile
  get() = gameProfile()
  set(value) {
    setGameProfile(value)
  }
