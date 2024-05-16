plugins {
    kotlin("jvm") version "1.9.24"
    id("application")
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit5")
    testImplementation("org.junit.jupiter:junit-jupiter-engine:5.9.3")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
    implementation("com.google.guava:guava:32.1.1-jre")
}

application {
    mainClass = "com.example.App"
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}

