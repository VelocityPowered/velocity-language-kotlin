package com.velocitypowered.api.kt.command

import com.mojang.brigadier.tree.CommandNode
import com.velocitypowered.api.command.CommandMeta
import com.velocitypowered.api.command.CommandSource

inline val CommandMeta.aliases: Collection<String>
  get() = aliases()

inline val CommandMeta.hints: Collection<CommandNode<CommandSource>>
  get() = hints()
