plugins {
    kotlin("jvm") version "2.0.21"
    application
}


repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation(kotlin("test"))
}


application {
    mainClass.set("org.example.AppKt")
}

tasks.jar {
    manifest {
        attributes["Main-Class"] = "org.example.AppKt"
    }
    from({
        configurations.runtimeClasspath.get().filter { it.name.endsWith("jar") }.map { zipTree(it) }
    })
}
