plugins {
    kotlin("jvm") version "1.9.22"
}

group = "com.anarchyghost"
version = "0.0.1"

val githubPackagesUsername: String by project
val githubPackagesToken: String by project
repositories {
    mavenCentral()
    maven {
        url = uri("https://maven.pkg.github.com/anarchyghost/gitlab-notification-core")
        credentials {
            username = githubPackagesUsername
            password = githubPackagesToken
        }
    }
}

dependencies {
    implementation("com.anarchyghost:gitlab-notification-core:0.0.1")
    testImplementation("org.jetbrains.kotlin:kotlin-test")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}