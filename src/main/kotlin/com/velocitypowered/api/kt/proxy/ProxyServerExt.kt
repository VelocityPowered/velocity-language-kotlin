package com.velocitypowered.api.kt.proxy

import com.velocitypowered.api.command.CommandManager
import com.velocitypowered.api.command.ConsoleCommandSource
import com.velocitypowered.api.event.EventManager
import com.velocitypowered.api.plugin.PluginManager
import com.velocitypowered.api.proxy.ProxyServer
import com.velocitypowered.api.proxy.config.ProxyConfig
import com.velocitypowered.api.proxy.messages.ChannelRegistrar
import com.velocitypowered.api.scheduler.Scheduler
import com.velocitypowered.api.util.ProxyVersion

val ProxyServer.consoleCommandSource: ConsoleCommandSource
  inline get() = consoleCommandSource()

val ProxyServer.pluginManager: PluginManager
  inline get() = pluginManager()

val ProxyServer.eventManager: EventManager
  inline get() = eventManager()

val ProxyServer.commandManager: CommandManager
  inline get() = commandManager()

val ProxyServer.scheduler: Scheduler
  inline get() = scheduler()

val ProxyServer.channelRegistrar: ChannelRegistrar
  inline get() = channelRegistrar()

val ProxyServer.configuration: ProxyConfig
  inline get() = configuration()

val ProxyServer.version: ProxyVersion
  inline get() = version()
