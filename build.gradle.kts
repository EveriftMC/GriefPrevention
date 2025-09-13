plugins {
    id("java-library")
}

group = "com.griefprevention"
version = "18.0.0-SNAPSHOT"
description = "GriefPrevention"
java.sourceCompatibility = JavaVersion.VERSION_21

repositories {
    maven("https://repo.papermc.io/repository/maven-public/")
}

dependencies {
    compileOnly(libs.paper.api)
}

tasks.withType<JavaCompile>() {
    options.encoding = "UTF-8"
}

tasks.withType<Javadoc>() {
    options.encoding = "UTF-8"
}
