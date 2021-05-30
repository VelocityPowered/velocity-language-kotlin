package com.velocitypowered.api.kt.event.player

import com.velocitypowered.api.event.player.ServerConnectedEvent
import com.velocitypowered.api.proxy.connection.Player
import com.velocitypowered.api.proxy.server.RegisteredServer

inline val ServerConnectedEvent.player: Player
  get() = player()

inline val ServerConnectedEvent.target: RegisteredServer
  get() = target()

inline val ServerConnectedEvent.previousServer: RegisteredServer?
  get() = previousServer()
