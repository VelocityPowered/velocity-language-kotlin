package com.velocitypowered.api.kt.event.command

import com.velocitypowered.api.command.CommandSource
import com.velocitypowered.api.event.command.CommandExecuteEvent

val CommandExecuteEvent.source: CommandSource
  inline get() = source()

val CommandExecuteEvent.rawCommand: String
  inline get() = rawCommand()

val CommandExecuteEvent.CommandResult.modifiedCommand: String?
  inline get() = modifiedCommand()
