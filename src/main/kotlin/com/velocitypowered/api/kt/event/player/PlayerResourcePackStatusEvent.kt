package com.velocitypowered.api.kt.event.player

import com.velocitypowered.api.event.player.PlayerResourcePackStatusEvent
import com.velocitypowered.api.proxy.connection.Player

inline val PlayerResourcePackStatusEvent.player: Player
  get() = player()

inline val PlayerResourcePackStatusEvent.status: PlayerResourcePackStatusEvent.Status
  get() = status()
