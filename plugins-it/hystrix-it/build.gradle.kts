/*
 * This file was generated by the Gradle 'init' task.
 *
 * This project uses @Incubating APIs which are subject to change.
 */

plugins {
    id("pinpoint.java-conventions")
}

dependencies {
    implementation(project(":pinpoint-plugin-it-utils"))
    testImplementation("com.netflix.hystrix:hystrix-core:1.5.12")
}

description = "pinpoint-hystrix-plugin-it"