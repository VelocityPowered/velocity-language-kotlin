package com.velocitypowered.api.language.kotlin.ext

import com.velocitypowered.api.util.GameProfile
import java.util.*

val GameProfile.name
    inline get() = name()

val GameProfile.uniqueId: UUID
    inline get() = uuid()

val GameProfile.properties: Collection<GameProfile.Property>
    inline get() = properties()

operator fun GameProfile.plus(properties: Iterable<GameProfile.Property>): GameProfile =
    addProperties(properties)

val GameProfile.Property.name: String
    inline get() = name()

val GameProfile.Property.value: String
    inline get() = value()

val GameProfile.Property.signature: String
    inline get() = signature()
