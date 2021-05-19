package com.velocitypowered.api.kt.event.player

import com.velocitypowered.api.event.player.DisconnectEvent
import com.velocitypowered.api.proxy.connection.Player

inline val DisconnectEvent.player: Player
  get() = player()

inline val DisconnectEvent.loginStatus: DisconnectEvent.LoginStatus
  get() = loginStatus()
