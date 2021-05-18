package com.velocitypowered.api.kt.event.player

import com.velocitypowered.api.event.player.ServerConnectedEvent
import com.velocitypowered.api.proxy.connection.Player
import com.velocitypowered.api.proxy.server.RegisteredServer

val ServerConnectedEvent.player: Player
  inline get() = player()

val ServerConnectedEvent.target: RegisteredServer
  inline get() = target()

val ServerConnectedEvent.previousServer: RegisteredServer?
  inline get() = previousServer()
