package com.velocitypowered.api.kt.event.player

import com.velocitypowered.api.event.player.PlayerChooseInitialServerEvent
import com.velocitypowered.api.proxy.connection.Player
import com.velocitypowered.api.proxy.server.RegisteredServer

val PlayerChooseInitialServerEvent.player: Player
  inline get() = player()

var PlayerChooseInitialServerEvent.initialServer: RegisteredServer?
  inline get() = initialServer()
  inline set(value) {
    setInitialServer(value)
  }

