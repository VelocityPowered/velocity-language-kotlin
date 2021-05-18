package com.velocitypowered.api.kt.plugin

import com.velocitypowered.api.plugin.PluginDescription
import com.velocitypowered.api.plugin.meta.PluginDependency
import java.nio.file.Path

val PluginDescription.id: String
  inline get() = id()

val PluginDescription.name: String
  inline get() = name()

val PluginDescription.version: String?
  inline get() = version()

val PluginDescription.description: String?
  inline get() = description()

val PluginDescription.url: String?
  inline get() = url()

val PluginDescription.authors: Collection<String>
  inline get() = authors()

val PluginDescription.dependencies: Collection<PluginDependency>
  inline get() = dependencies()

val PluginDescription.file: Path?
  inline get() = file()
