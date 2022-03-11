/*
 * This file was generated by the Gradle 'init' task.
 *
 * This project uses @Incubating APIs which are subject to change.
 */

plugins {
    id("pinpoint.java-conventions")
}

dependencies {
    implementation(project(":pinpoint-commons"))
    implementation(project(":pinpoint-bootstrap-core"))
    implementation(project(":pinpoint-commons-profiler"))
    implementation("io.grpc:grpc-core:1.42.1")
    implementation("io.grpc:grpc-netty:1.42.1")
    implementation("io.netty:netty-handler:4.1.63.Final")
    implementation("io.netty:netty-transport-native-epoll:4.1.63.Final")
    implementation("io.netty:netty-codec-http2:4.1.63.Final")
    implementation("io.grpc:grpc-stub:1.42.1")
    implementation("io.grpc:grpc-protobuf:1.42.1")
    implementation("org.apache.logging.log4j:log4j-slf4j-impl:2.12.4")
    implementation("org.apache.logging.log4j:log4j-core:2.12.4")
    implementation("org.apache.commons:commons-lang3:3.8.1")
    runtimeOnly("io.netty:netty-tcnative-boringssl-static:2.0.38.Final")
    runtimeOnly("org.slf4j:slf4j-api:1.7.30")
    testImplementation("io.grpc:grpc-testing:1.42.1")
    compileOnly("com.google.code.findbugs:jsr305:3.0.2")
}

description = "pinpoint-grpc"