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

inline val ProxyServer.consoleCommandSource: ConsoleCommandSource
  get() = consoleCommandSource()

inline val ProxyServer.pluginManager: PluginManager
  get() = pluginManager()

inline val ProxyServer.eventManager: EventManager
  get() = eventManager()

inline val ProxyServer.commandManager: CommandManager
  get() = commandManager()

inline val ProxyServer.scheduler: Scheduler
  get() = scheduler()

inline val ProxyServer.channelRegistrar: ChannelRegistrar
  get() = channelRegistrar()

inline val ProxyServer.configuration: ProxyConfig
  get() = configuration()

inline val ProxyServer.version: ProxyVersion
  get() = version()
