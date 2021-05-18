package com.velocitypowered.api.kt.command

import com.velocitypowered.api.command.BrigadierCommand
import com.velocitypowered.api.command.CommandManager
import com.velocitypowered.api.command.CommandMeta

inline fun CommandManager.createMeta(
  alias: String,
  build: CommandMeta.Builder.() -> Unit
): CommandMeta = createMetaBuilder(alias).apply(build).build()

inline fun CommandManager.createMeta(
  command: BrigadierCommand,
  build: CommandMeta.Builder.() -> Unit
): CommandMeta = createMetaBuilder(command).apply(build).build()

operator fun CommandManager.contains(alias: String): Boolean =
  hasCommand(alias)
