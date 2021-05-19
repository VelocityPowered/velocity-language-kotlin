package com.velocitypowered.api.kt.plugin.meta

import com.velocitypowered.api.plugin.meta.PluginDependency

inline val PluginDependency.id: String
  get() = id()

inline val PluginDependency.version: String?
  get() = version()

inline val PluginDependency.isOptional: Boolean
  get() = optional()

operator fun PluginDependency.component1(): String = id
operator fun PluginDependency.component2(): String? = version
operator fun PluginDependency.component3(): Boolean = isOptional
