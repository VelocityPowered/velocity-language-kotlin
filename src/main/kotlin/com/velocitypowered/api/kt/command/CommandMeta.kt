package com.velocitypowered.api.kt.command

import com.mojang.brigadier.tree.CommandNode
import com.velocitypowered.api.command.CommandMeta
import com.velocitypowered.api.command.CommandSource

val CommandMeta.aliases: Collection<String>
  inline get() = aliases()

val CommandMeta.hints: Collection<CommandNode<CommandSource>>
  inline get() = hints()
