package com.velocitypowered.api.kt.event.player

import com.velocitypowered.api.event.player.PlayerClientSettingsChangedEvent
import com.velocitypowered.api.proxy.connection.Player
import com.velocitypowered.api.proxy.player.ClientSettings

val PlayerClientSettingsChangedEvent.player: Player
  inline get() = player()

val PlayerClientSettingsChangedEvent.settings: ClientSettings
  inline get() = settings()
