package com.velocitypowered.api.kt.plugin

import com.velocitypowered.api.plugin.PluginContainer
import com.velocitypowered.api.plugin.PluginDescription

inline val PluginContainer.description: PluginDescription
  get() = description()

inline val PluginContainer.instance: Any?
  get() = instance()
