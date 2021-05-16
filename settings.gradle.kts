rootProject.name = "velocity-language-kotlin"

pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }

    plugins {
        val kotlinVersion: String by settings

        kotlin("jvm") version kotlinVersion
        kotlin("kapt") version kotlinVersion
        kotlin("plugin.serialization") version kotlinVersion

        id("com.github.johnrengelman.shadow") version "6.1.0"
    }
}