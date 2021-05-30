package com.velocitypowered.api.kt.event.player

import com.velocitypowered.api.event.player.ServerPreConnectEvent
import com.velocitypowered.api.proxy.connection.Player
import com.velocitypowered.api.proxy.server.RegisteredServer

inline val ServerPreConnectEvent.player: Player
  get() = player()

inline val ServerPreConnectEvent.originalTarget: RegisteredServer
  get() = originalTarget()

inline val ServerPreConnectEvent.ServerResult.target: RegisteredServer?
  get() = target()
