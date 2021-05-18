package com.velocitypowered.api.kt.event.player

import com.velocitypowered.api.event.player.PostLoginEvent
import com.velocitypowered.api.proxy.connection.Player

val PostLoginEvent.player: Player
  inline get() = player()
