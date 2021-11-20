plugins {
    application
    scala
    id("com.palantir.graal") version "0.10.0"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.scala-lang:scala3-library_3:3.1.0")
}

application {
    mainClass.set("run")
}

graal {
    javaVersion("11")
    graalVersion("21.3.0")
    mainClass(application.mainClass.get())
    outputName("scala3-graalvm-tester")
    option("--verbose")
    option("--no-fallback")
}