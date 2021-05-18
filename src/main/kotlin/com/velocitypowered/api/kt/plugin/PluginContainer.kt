package com.velocitypowered.api.kt.plugin

import com.velocitypowered.api.plugin.PluginContainer
import com.velocitypowered.api.plugin.PluginDescription

val PluginContainer.description: PluginDescription
  inline get() = description()

val PluginContainer.instance: Any?
  inline get() = instance()
