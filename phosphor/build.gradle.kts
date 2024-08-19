@file:OptIn(ExperimentalEncodingApi::class)

import com.vanniktech.maven.publish.SonatypeHost
import org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi
import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import kotlin.io.encoding.ExperimentalEncodingApi

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.android.library)
    alias(libs.plugins.compose.compiler)
    alias(libs.plugins.compose.multiplatform)
    id("org.jetbrains.dokka") version "1.9.20"
    id("com.vanniktech.maven.publish") version "0.29.0"
}

kotlin {
    androidTarget {
        @OptIn(ExperimentalKotlinGradlePluginApi::class)
        compilerOptions {
            jvmTarget.set(JvmTarget.JVM_11)
        }
        publishLibraryVariants("release")
    }

    jvm("desktop")

    iosX64()
    iosArm64()
    iosSimulatorArm64()

    sourceSets {
        val desktopMain by getting
        commonMain.dependencies {
            compileOnly(compose.runtime)
            compileOnly(compose.foundation)
            compileOnly(compose.ui)
        }
    }
}

android {
    namespace = "com.adamglin.phosphoricon"
    compileSdk = libs.versions.androidCompileSdk.get().toInt()
    sourceSets["main"].manifest.srcFile("src/androidMain/AndroidManifest.xml")

    defaultConfig {
        minSdk = libs.versions.androidMinSdk.get().toInt()
        lint.targetSdk = libs.versions.androidTargetSdk.get().toInt()
    }

    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    buildFeatures {
        compose = true
    }
}


mavenPublishing {
    val javadocJar = tasks.register("javadocJar", Jar::class.java) {
        archiveClassifier.set("javadoc")
    }
    coordinates(
        groupId = "com.adamglin",
        artifactId = "phosphor-icon",
        version = "0.0.3"
    )
    pom {
        name.set("phosphor-icon")
        description.set("a kotlin platform library for show drop shadow in compose.")
        url.set("https://github.com/adamglin0/phosphor-icon")
        licenses {
            license {
                name.set("MIT")
                url.set("https://opensource.org/licenses/MIT")
            }
        }
        developers {
            developer {
                name.set("adamglin")
                email.set("dev@adamglin.com")
            }
        }
        issueManagement {
            system.set("Github")
            url.set("https://github.com/adamglin0/phosphor-icon/issues")
        }
        scm {
            connection.set("https://github.com/adamglin0/phosphor-icon.git")
            url.set("https://github.com/adamglin0/phosphor-icon")
        }
    }
    publishToMavenCentral(SonatypeHost.CENTRAL_PORTAL)
    signAllPublications()
}

