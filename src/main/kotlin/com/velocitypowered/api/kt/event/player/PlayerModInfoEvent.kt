package com.velocitypowered.api.kt.event.player

import com.velocitypowered.api.event.player.PlayerModInfoEvent
import com.velocitypowered.api.proxy.connection.Player
import com.velocitypowered.api.util.ModInfo

inline val PlayerModInfoEvent.player: Player
  get() = player()

inline val PlayerModInfoEvent.modInfo: ModInfo
  get() = modInfo()
