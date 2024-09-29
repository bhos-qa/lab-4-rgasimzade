plugins {
    id("java")
    id("jacoco")
    id("org.sonarqube") version "4.0.0.2929"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

tasks.jacocoTestReport {
    dependsOn(tasks.test)
    reports {
        html.required.set(true) // HTML report
        xml.required.set(true) // XML report
    }
}

sonarqube {
    properties {
        property("sonar.projectKey", "bhos-qa_lab-4-rgasimzade")
        property("sonar.organization", "bhos-qa")
        property("sonar.host.url", "https://sonarcloud.io")
        property("sonar.java.binaries", "build/classes/java/main") // Specify the Java binaries directory
    }
}
