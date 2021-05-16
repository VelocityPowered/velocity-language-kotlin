package com.velocitypowered.api.language.kotlin.ext

import com.velocitypowered.api.util.GameProfile
import java.util.*

val GameProfile.uniqueId: UUID
    inline get() = uuid()

val GameProfile.name
    inline get() = name()

val GameProfile.properties: Collection<GameProfile.Property>
    inline get() = properties()

operator fun GameProfile.plus(properties: Iterable<GameProfile.Property>): GameProfile =
    addProperties(properties)

operator fun GameProfile.component1(): UUID = uniqueId

operator fun GameProfile.component2(): String = name

operator fun GameProfile.component3(): Collection<GameProfile.Property> = properties()

val GameProfile.Property.name: String
    inline get() = name()

val GameProfile.Property.value: String
    inline get() = value()

val GameProfile.Property.signature: String
    inline get() = signature()

operator fun GameProfile.Property.component1() = name

operator fun GameProfile.Property.component2() = value

operator fun GameProfile.Property.component3() = signature
