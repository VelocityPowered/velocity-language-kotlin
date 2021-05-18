package com.velocitypowered.api.kt.event.player

import com.velocitypowered.api.event.player.PlayerChannelRegisterEvent
import com.velocitypowered.api.proxy.connection.Player
import com.velocitypowered.api.proxy.messages.PluginChannelId

val PlayerChannelRegisterEvent.player: Player
  inline get() = player()

val PlayerChannelRegisterEvent.channels: Collection<PluginChannelId>
  inline get() = channels()
