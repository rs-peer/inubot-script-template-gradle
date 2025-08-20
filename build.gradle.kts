plugins {
    `java-library`
    kotlin("jvm") version "2.2.0"
}

group = "org.CHANGEME"
version = "1.0-SNAPSHOT"

repositories {
    mavenLocal()
}

dependencies {
    implementation(files("${System.getProperty("user.home")}/inubot/inubot.jar"))
}

kotlin {
    jvmToolchain(11)
}

tasks.register<Copy>("copyToInubotScripts") {
    dependsOn("jar")
    from(layout.buildDirectory.dir("libs"))
    into("${System.getProperty("user.home")}/inubot/scripts/")
    include("*.jar")
}

tasks.build {
    dependsOn("copyToInubotScripts")
}
