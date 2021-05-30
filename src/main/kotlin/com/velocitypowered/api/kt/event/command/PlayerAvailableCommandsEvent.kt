package com.velocitypowered.api.kt.event.command

import com.mojang.brigadier.tree.RootCommandNode
import com.velocitypowered.api.event.command.PlayerAvailableCommandsEvent
import com.velocitypowered.api.proxy.connection.Player

inline val PlayerAvailableCommandsEvent.player: Player
  get() = player()

inline val PlayerAvailableCommandsEvent.rootNode: RootCommandNode<*>
  get() = rootNode()
