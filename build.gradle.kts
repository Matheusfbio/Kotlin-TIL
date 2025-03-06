plugins {
    kotlin("jvm") version "2.1.10"
}

group = "org.matthewDev"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
//    testImplementation(kotlin("test"))
    testImplementation("org.junit.jupiter:junit-jupiter:5.9.3")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit5:1.9.0")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(23)
}