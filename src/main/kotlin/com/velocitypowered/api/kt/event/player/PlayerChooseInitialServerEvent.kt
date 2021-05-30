package com.velocitypowered.api.kt.event.player

import com.velocitypowered.api.event.player.PlayerChooseInitialServerEvent
import com.velocitypowered.api.proxy.connection.Player
import com.velocitypowered.api.proxy.server.RegisteredServer

inline val PlayerChooseInitialServerEvent.player: Player
  get() = player()

inline var PlayerChooseInitialServerEvent.initialServer: RegisteredServer?
  get() = initialServer()
  set(value) {
    setInitialServer(value)
  }

