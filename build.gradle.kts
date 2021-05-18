plugins {
  kotlin("jvm")
  kotlin("kapt")
  kotlin("plugin.serialization")
  id("com.github.johnrengelman.shadow")
}

val kotlinVersion: String by project

group = "com.velocitypowered"
version = "$kotlinVersion-SNAPSHOT"

repositories {
  mavenCentral()

  maven("https://repo.velocitypowered.com/snapshots/")
}

dependencies {
  val velocityVersion: String by project

  implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.2.1")
  implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:$kotlinVersion")
  implementation("org.jetbrains.kotlinx:kotlinx-coroutines-jdk8:$kotlinVersion")

  compileOnly("com.velocitypowered:velocity-api:$velocityVersion")
  kapt("com.velocitypowered:velocity-annotation-processor:$velocityVersion")
}

tasks.build {
  dependsOn(tasks.shadowJar.get())
}
