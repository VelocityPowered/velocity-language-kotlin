package com.velocitypowered.api.kt.plugin

import com.velocitypowered.api.plugin.PluginContainer
import com.velocitypowered.api.plugin.PluginManager

inline val PluginManager.plugins: Collection<PluginContainer>
  get() = plugins()
