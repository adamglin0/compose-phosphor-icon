import com.vanniktech.maven.publish.SonatypeHost
import org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi
import org.jetbrains.kotlin.gradle.ExperimentalWasmDsl
import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.android.library)
    alias(libs.plugins.compose.compiler)
    alias(libs.plugins.compose.multiplatform)
    alias(libs.plugins.dokka)
    alias(libs.plugins.maven.publish)
}

kotlin {
    androidTarget {
        @OptIn(ExperimentalKotlinGradlePluginApi::class)
        compilerOptions {
            jvmTarget.set(JvmTarget.JVM_11)
        }
        publishLibraryVariants("release")
    }

    js(IR) {
        browser()
    }

    @OptIn(ExperimentalWasmDsl::class)
    wasmJs {
        browser()
    }

    jvm("desktop") {
        compilerOptions {
            jvmTarget = !JvmTarget.JVM_1_8
        }
    }

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
        version = "1.0.0"
    )
    pom {
        name.set("phosphor-icon")
        description.set("Phosphor Icons for Compose Multiplatform.")
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

