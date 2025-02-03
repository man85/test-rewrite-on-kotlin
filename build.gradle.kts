plugins {
    kotlin("jvm") version "1.9.23"
    id("org.openrewrite.rewrite") version "7.0.4"
}

rewrite {
    activeRecipe("com.yourorg.AddBuildPluginExample1")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-test")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}