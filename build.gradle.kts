plugins {
  kotlin("jvm")
  kotlin("kapt")
  kotlin("plugin.serialization")
  id("com.github.johnrengelman.shadow")
}

val kotlinVersion: String by project
val velocityVersion: String by project

group = "com.velocitypowered"
version = "$velocityVersion+$kotlinVersion"

repositories {
  mavenLocal()
  mavenCentral()

  maven("https://repo.velocitypowered.com/snapshots/")
}

dependencies {
  implementation(kotlin("reflect"))
  implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.2.1")
  implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:$kotlinVersion")
  implementation("org.jetbrains.kotlinx:kotlinx-coroutines-jdk8:$kotlinVersion")
  implementation("net.kyori:adventure-extra-kotlin:4.7.0")

  compileOnly("com.velocitypowered:velocity-api:$velocityVersion")
  kapt("com.velocitypowered:velocity-annotation-processor:$velocityVersion")
}

tasks.build {
  dependsOn(tasks.shadowJar.get())
}
