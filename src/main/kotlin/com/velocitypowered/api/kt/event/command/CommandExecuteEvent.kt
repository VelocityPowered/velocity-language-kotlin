package com.velocitypowered.api.kt.event.command

import com.velocitypowered.api.command.CommandSource
import com.velocitypowered.api.event.command.CommandExecuteEvent

inline val CommandExecuteEvent.source: CommandSource
  get() = source()

inline val CommandExecuteEvent.rawCommand: String
  get() = rawCommand()

inline val CommandExecuteEvent.CommandResult.modifiedCommand: String?
  get() = modifiedCommand()
