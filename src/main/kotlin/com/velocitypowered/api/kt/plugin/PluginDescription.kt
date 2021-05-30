package com.velocitypowered.api.kt.plugin

import com.velocitypowered.api.plugin.PluginDescription
import com.velocitypowered.api.plugin.meta.PluginDependency
import java.nio.file.Path

inline val PluginDescription.id: String
  get() = id()

inline val PluginDescription.name: String
  get() = name()

inline val PluginDescription.version: String?
  get() = version()

inline val PluginDescription.description: String?
  get() = description()

inline val PluginDescription.url: String?
  get() = url()

inline val PluginDescription.authors: Collection<String>
  get() = authors()

inline val PluginDescription.dependencies: Collection<PluginDependency>
  get() = dependencies()

inline val PluginDescription.file: Path?
  get() = file()
