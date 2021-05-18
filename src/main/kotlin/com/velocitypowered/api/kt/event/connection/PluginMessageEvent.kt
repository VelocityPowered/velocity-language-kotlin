package com.velocitypowered.api.kt.event.connection

import com.velocitypowered.api.event.connection.PluginMessageEvent
import com.velocitypowered.api.proxy.messages.ChannelMessageSink
import com.velocitypowered.api.proxy.messages.ChannelMessageSource
import com.velocitypowered.api.proxy.messages.PluginChannelId

val PluginMessageEvent.source: ChannelMessageSource
  inline get() = source()

val PluginMessageEvent.sink: ChannelMessageSink
  inline get() = sink()

val PluginMessageEvent.channel: PluginChannelId
  inline get() = channel()

val PluginMessageEvent.rawMessage: ByteArray
  inline get() = rawMessage()
