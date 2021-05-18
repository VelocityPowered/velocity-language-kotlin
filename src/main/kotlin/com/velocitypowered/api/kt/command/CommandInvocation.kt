package com.velocitypowered.api.kt.command

import com.velocitypowered.api.command.CommandInvocation
import com.velocitypowered.api.command.CommandSource

val CommandInvocation<*>.source: CommandSource
  inline get() = source()

val <T> CommandInvocation<T>.arguments: T
  inline get() = arguments()

val CommandInvocation<*>.alias: String
  inline get() = alias()
