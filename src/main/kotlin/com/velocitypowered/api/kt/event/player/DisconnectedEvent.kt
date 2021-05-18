package com.velocitypowered.api.kt.event.player

import com.velocitypowered.api.event.player.DisconnectEvent
import com.velocitypowered.api.proxy.connection.Player

val DisconnectEvent.player: Player
  inline get() = player()

val DisconnectEvent.loginStatus: DisconnectEvent.LoginStatus
  inline get() = loginStatus()
