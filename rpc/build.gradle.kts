/*
 * This file was generated by the Gradle 'init' task.
 *
 * This project uses @Incubating APIs which are subject to change.
 */

plugins {
    id("pinpoint.java-conventions")
}

dependencies {
    implementation(project(":pinpoint-annotations"))
    implementation(project(":pinpoint-commons"))
    implementation(project(":pinpoint-commons-profiler"))
    implementation("io.netty:netty:3.10.6.Final")
    implementation("org.apache.logging.log4j:log4j-slf4j-impl:2.12.4")
    implementation("org.apache.logging.log4j:log4j-core:2.12.4")
    runtimeOnly("org.slf4j:slf4j-api:1.7.30")
    testImplementation(project(":pinpoint-testcase"))
    testImplementation("org.awaitility:awaitility:3.1.5")
}

description = "pinpoint-rpc"

val testsJar by tasks.registering(Jar::class) {
    archiveClassifier.set("tests")
    from(sourceSets["test"].output)
}

(publishing.publications["maven"] as MavenPublication).artifact(testsJar)