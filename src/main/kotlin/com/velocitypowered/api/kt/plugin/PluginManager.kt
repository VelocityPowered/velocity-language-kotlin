package com.velocitypowered.api.kt.plugin

import com.velocitypowered.api.plugin.PluginContainer
import com.velocitypowered.api.plugin.PluginManager

val PluginManager.plugins: Collection<PluginContainer>
  inline get() = plugins()
