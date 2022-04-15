/*
 * This file was generated by the Gradle 'init' task.
 *
 * This project uses @Incubating APIs which are subject to change.
 */

plugins {
    id("com.navercorp.pinpoint.gradle.plugins.toolchain.java8")
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web:${Versions.springBoot}")
    implementation("org.springframework.boot:spring-boot-starter-logging:${Versions.springBoot}")
    implementation("org.springframework.boot:spring-boot-starter-actuator:${Versions.springBoot}")
    implementation("org.springdoc:springdoc-openapi-ui:1.4.4")
    implementation("com.alibaba.cloud:spring-cloud-starter-stream-rocketmq:2.2.3.RELEASE")
    compileOnly("org.springframework.boot:spring-boot-starter-tomcat:${Versions.springBoot}")
}

description = "pinpoint-rocketmq-springcloud-stream"
