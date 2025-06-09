plugins {
    kotlin("jvm") version PluginVersions.kotlin
    kotlin("plugin.spring") version PluginVersions.kotlin
    kotlin("plugin.jpa") version PluginVersions.jpa
    id("org.springframework.boot") version PluginVersions.springBoot
    id("io.spring.dependency-management") version PluginVersions.dependencyManagement
    id("org.jetbrains.kotlin.kapt") version PluginVersions.kapt
    id("org.jlleitschuh.gradle.ktlint") version PluginVersions.ktlint
}

group = "com"
version = "0.0.1-SNAPSHOT"

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(17)
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(Dependencies.springBootStarter)
    implementation(Dependencies.springBootSecurity)
    implementation(Dependencies.springBootOAuth2Client)
    implementation(Dependencies.springBootWeb)
    implementation(Dependencies.kotlinReflect)

    implementation(Dependencies.jjwtApi)
    runtimeOnly(Dependencies.jjwtImpl)
    runtimeOnly(Dependencies.jjwtJackson)

    implementation(Dependencies.springDataRedis)
    implementation(Dependencies.springBootDataRedis)

    implementation(Dependencies.springBootDataJpa)

    testImplementation(Dependencies.springBootTest)
    testImplementation(Dependencies.kotlinTestJunit5)
    testRuntimeOnly(Dependencies.junitPlatformLauncher)

    runtimeOnly(Dependencies.mysqlConnector)
    implementation(Dependencies.springCloudOpenFeign)

    implementation(Dependencies.hibernateValidator)
    implementation(Dependencies.jakartaValidation)

    implementation(Dependencies.mapstruct)
    kapt(Dependencies.mapstructProcessor)
}

kotlin {
    compilerOptions {
        freeCompilerArgs.addAll("-Xjsr305=strict")
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}

dependencyManagement {
    imports {
        mavenBom("org.springframework.cloud:spring-cloud-dependencies:2023.0.1")
    }
}
