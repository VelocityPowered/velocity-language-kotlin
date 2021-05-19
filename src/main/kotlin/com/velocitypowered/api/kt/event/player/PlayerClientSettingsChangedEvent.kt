package com.velocitypowered.api.kt.event.player

import com.velocitypowered.api.event.player.PlayerClientSettingsChangedEvent
import com.velocitypowered.api.proxy.connection.Player
import com.velocitypowered.api.proxy.player.ClientSettings

inline val PlayerClientSettingsChangedEvent.player: Player
  get() = player()

inline val PlayerClientSettingsChangedEvent.settings: ClientSettings
  get() = settings()
