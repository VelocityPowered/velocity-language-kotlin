package com.velocitypowered.api.kt.event.player

import com.velocitypowered.api.event.player.ServerPostConnectEvent
import com.velocitypowered.api.proxy.connection.Player
import com.velocitypowered.api.proxy.server.RegisteredServer

inline val ServerPostConnectEvent.player: Player
  get() = player()

inline val ServerPostConnectEvent.previousServer: RegisteredServer?
  get() = previousServer()
