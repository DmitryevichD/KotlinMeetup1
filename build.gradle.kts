import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("org.springframework.boot") version "2.2.1.RELEASE"
    id("io.spring.dependency-management") version "1.0.8.RELEASE"
    kotlin("jvm") version "1.3.50"
    // contains kotlin-allopen for  @Component, @Async, @Transactional, @Cacheable, @SpringBootTest
    // @Configuration, @Controller, @RestController, @Service  @Repository @Component
    // @see: https://kotlinlang.org/docs/reference/compiler-plugins.html#spring-support
    kotlin("plugin.spring") version "1.3.50"
    // contains kotlin-noarg for @Entity, @Embeddable, @MappedSuperclass
    // @see: https://kotlinlang.org/docs/reference/compiler-plugins.html#jpa-support
    kotlin("plugin.jpa") version "1.3.50"
    // @see: https://arturbosch.github.io/detekt/
    id("io.gitlab.arturbosch.detekt") version "1.1.1"
    // @see: https://ktlint.github.io/
    id("org.jlleitschuh.gradle.ktlint") version "9.0.0"
}

group = "ru.openbank.meetup"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_1_8

configurations {
    compileOnly {
        extendsFrom(configurations.annotationProcessor.get())
    }
}

repositories {
    mavenCentral()
}

val springCloudVersion = "Greenwich.SR2"
val swaggerVersion = "2.9.2"
val postgreDriverVersion = "42.2.5"
val gsonVersion = "2.8.5"
val apacheHttpVersion = "4.5"
val logbackEncoder = "6.1"
val kotlinLoggingVersion = "1.7.6"
val kotlinMockitoVersion = "2.2.0"

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("org.springframework.boot:spring-boot-starter")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.2")
    implementation("io.springfox:springfox-swagger2:${swaggerVersion}")
    implementation("io.springfox:springfox-swagger-ui:${swaggerVersion}")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("io.github.microutils:kotlin-logging:${kotlinLoggingVersion}")

    compileOnly("org.projectlombok:lombok")
    annotationProcessor("org.projectlombok:lombok")
    testImplementation("org.springframework.boot:spring-boot-starter-test") {
        exclude(group = "org.junit.vintage", module = "junit-vintage-engine")
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "1.8"
    }
}
