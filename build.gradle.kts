import org.gradle.internal.impldep.com.fasterxml.jackson.core.JsonPointer.compile
import org.jetbrains.kotlin.gradle.plugin.kotlinToolingVersion
import java.net.URI

// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.android.library) apply false
}

buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath ("com.android.tools.build:gradle:4.2.2")
        classpath ("org.jetbrains.kotlin:kotlin-gradle-plugin:2.0.21")
    }
}

allprojects {
    repositories {
        google()
        maven {
            url = URI("https://jitpack.io")
        }
        mavenCentral()
    }
}
dependencies {
    compile ("com.github.jitpack:android-example:0.1.0")
}