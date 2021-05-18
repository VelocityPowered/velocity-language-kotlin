package com.velocitypowered.api.kt.event.player

import com.velocitypowered.api.event.player.ServerPostConnectEvent
import com.velocitypowered.api.proxy.connection.Player
import com.velocitypowered.api.proxy.server.RegisteredServer

val ServerPostConnectEvent.player: Player
  inline get() = player()

val ServerPostConnectEvent.previousServer: RegisteredServer?
  inline get() = previousServer()
