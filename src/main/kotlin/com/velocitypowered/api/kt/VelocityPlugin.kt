package com.velocitypowered.api.kt

import com.google.inject.Inject
import com.velocitypowered.api.plugin.Plugin
import java.util.logging.Logger

@Plugin(id = "velocity-language-kotlin", authors = ["Velocity Contributors"])
@Suppress("unused")
class VelocityPlugin @Inject constructor(
  val logger: Logger,
)
