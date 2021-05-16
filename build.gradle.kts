val kotlinVersion = "1.5.0"

plugins {
    kotlin("jvm") version kotlinVersion
    kotlin("kapt") version kotlinVersion
    kotlin("plugin.serialization") version kotlinVersion
    id("com.github.johnrengelman.shadow") version "6.1.0"
}

group = "com.velocitypowered"
version = kotlinVersion + "-SNAPSHOT"

repositories {
    mavenCentral()

    maven("https://repo.velocitypowered.com/snapshots/")
}

dependencies {
    val velocityVersion: String by project

    implementation(kotlin("stdlib"))
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.2.1")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:$kotlinVersion")

    compileOnly("com.velocitypowered:velocity-api:$velocityVersion")
    kapt("com.velocitypowered:velocity-annotation-processor:$velocityVersion")
}

tasks.build {
    dependsOn(tasks.shadowJar.get())
}
