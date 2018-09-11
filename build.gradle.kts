import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.2.60"
    "org.junit.platform.gradle.plugin"
}

dependencies {
    compile(kotlin("stdlib-jdk8"))
}

repositories {
    mavenCentral()
}

tasks.withType<Test> {
	useJUnitPlatform {
        includeEngines = setOf("spek")
    }

	testLogging {
        showStandardStreams = true
		events("passed", "skipped", "failed")
	}
}

tasks {
    withType<Test> {
        testLogging.showStandardStreams = true
    }
}
val compileKotlin: KotlinCompile by tasks
compileKotlin.kotlinOptions {
    jvmTarget = "1.8"
}
val compileTestKotlin: KotlinCompile by tasks
compileTestKotlin.kotlinOptions {
    jvmTarget = "1.8"
}