package com.velocitypowered.api.kt.event.player

import com.velocitypowered.api.event.player.ServerPreConnectEvent
import com.velocitypowered.api.proxy.connection.Player
import com.velocitypowered.api.proxy.server.RegisteredServer

val ServerPreConnectEvent.player: Player
  inline get() = player()

val ServerPreConnectEvent.originalTarget: RegisteredServer
  inline get() = originalTarget()

val ServerPreConnectEvent.ServerResult.target: RegisteredServer?
  inline get() = target()
