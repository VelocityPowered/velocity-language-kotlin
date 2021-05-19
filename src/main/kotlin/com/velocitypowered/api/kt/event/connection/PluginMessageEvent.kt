package com.velocitypowered.api.kt.event.connection

import com.velocitypowered.api.event.connection.PluginMessageEvent
import com.velocitypowered.api.proxy.messages.ChannelMessageSink
import com.velocitypowered.api.proxy.messages.ChannelMessageSource
import com.velocitypowered.api.proxy.messages.PluginChannelId

inline val PluginMessageEvent.source: ChannelMessageSource
  get() = source()

inline val PluginMessageEvent.sink: ChannelMessageSink
  get() = sink()

inline val PluginMessageEvent.channel: PluginChannelId
  get() = channel()

inline val PluginMessageEvent.rawMessage: ByteArray
  get() = rawMessage()
