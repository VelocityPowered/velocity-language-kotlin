package com.velocitypowered.api.kt.command

import com.velocitypowered.api.command.CommandInvocation
import com.velocitypowered.api.command.CommandSource

inline val CommandInvocation<*>.source: CommandSource
  get() = source()

inline val <T> CommandInvocation<T>.arguments: T
  get() = arguments()

inline val CommandInvocation<*>.alias: String
  get() = alias()
