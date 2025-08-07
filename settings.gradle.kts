pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
    plugins {
        id("com.android.application")    version "8.12.0"
        id("com.android.library")        version "8.12.0"
        id("org.jetbrains.kotlin.android") version "1.9.23"
        id("org.jetbrains.kotlin.kapt")    version "1.9.23"
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "health-is-wealth"
include(":app")
