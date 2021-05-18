package com.velocitypowered.api.kt.event.command

import com.mojang.brigadier.tree.RootCommandNode
import com.velocitypowered.api.event.command.PlayerAvailableCommandsEvent
import com.velocitypowered.api.proxy.connection.Player

val PlayerAvailableCommandsEvent.player: Player
  inline get() = player()

val PlayerAvailableCommandsEvent.rootNode: RootCommandNode<*>
  inline get() = rootNode()
