package com.velocitypowered.api.kt.event.player

import com.velocitypowered.api.event.player.PlayerModInfoEvent
import com.velocitypowered.api.proxy.connection.Player
import com.velocitypowered.api.util.ModInfo

val PlayerModInfoEvent.player: Player
  inline get() = player()

val PlayerModInfoEvent.modInfo: ModInfo
  inline get() = modInfo()
