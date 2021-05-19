package com.velocitypowered.api.kt.event.player

import com.velocitypowered.api.event.player.PlayerChannelRegisterEvent
import com.velocitypowered.api.proxy.connection.Player
import com.velocitypowered.api.proxy.messages.PluginChannelId

inline val PlayerChannelRegisterEvent.player: Player
  get() = player()

inline val PlayerChannelRegisterEvent.channels: Collection<PluginChannelId>
  get() = channels()
