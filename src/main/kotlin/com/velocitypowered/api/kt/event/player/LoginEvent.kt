package com.velocitypowered.api.kt.event.player

import com.velocitypowered.api.event.player.LoginEvent
import com.velocitypowered.api.proxy.connection.Player

inline val LoginEvent.player: Player
  get() = player()
