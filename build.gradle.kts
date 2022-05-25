plugins {
  kotlin("jvm")
  kotlin("kapt")
  kotlin("plugin.serialization")
  id("com.github.johnrengelman.shadow")
  `maven-publish`
}

val kotlinVersion: String by project
val velocityVersion: String by project
val coroutinesVersion: String by project

group = "com.velocitypowered"
version = "$velocityVersion+$kotlinVersion"

repositories {
  mavenLocal()
  mavenCentral()

  maven("https://repo.papermc.io/repository/maven-public/")
}

dependencies {
  implementation(kotlin("reflect"))
  implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.3.3")
  api(platform("org.jetbrains.kotlinx:kotlinx-coroutines-bom:$coroutinesVersion"))
  implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutinesVersion")
  implementation("org.jetbrains.kotlinx:kotlinx-coroutines-jdk8:$coroutinesVersion")
  implementation("net.kyori:adventure-extra-kotlin:4.10.1")

  compileOnly("com.velocitypowered:velocity-api:$velocityVersion")
  kapt("com.velocitypowered:velocity-api:$velocityVersion")
}

tasks.build {
  dependsOn(tasks.shadowJar.get())
  dependsOn("generateTemplates")
}

val templateSource = file("src/main/templates")
val templateDest = layout.buildDirectory.dir("generated/sources/templates")
tasks.create<Copy>("generateTemplates") {
  val props = mapOf(
    "version" to project.version
  )
  inputs.properties(props)
  from(templateSource)
  into(templateDest)
  expand(props)
}

sourceSets.main {
  java {
    srcDir(templateDest)
  }
}

publishing {
  publications {
    create<MavenPublication>("mavenJava") {
      artifact(tasks.shadowJar.get())
    }
  }
}
