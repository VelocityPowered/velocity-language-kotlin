package com.velocitypowered.api.kt.event.player

import com.velocitypowered.api.event.player.PlayerResourcePackStatusEvent
import com.velocitypowered.api.proxy.connection.Player

val PlayerResourcePackStatusEvent.player: Player
  inline get() = player()

val PlayerResourcePackStatusEvent.status: PlayerResourcePackStatusEvent.Status
  inline get() = status()
