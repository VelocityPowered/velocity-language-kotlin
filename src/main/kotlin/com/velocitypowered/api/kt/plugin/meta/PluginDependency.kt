package com.velocitypowered.api.kt.plugin.meta

import com.velocitypowered.api.plugin.meta.PluginDependency

val PluginDependency.id: String
  inline get() = id()

val PluginDependency.version: String?
  inline get() = version()

val PluginDependency.isOptional: Boolean
  inline get() = optional()

operator fun PluginDependency.component1(): String = id
operator fun PluginDependency.component2(): String? = version
operator fun PluginDependency.component3(): Boolean = isOptional
