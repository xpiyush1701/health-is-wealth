plugins {
    id("com.android.application") apply false
    id("com.android.library")    apply false
    id("org.jetbrains.kotlin.android") apply false
    id("org.jetbrains.kotlin.kapt")    apply false
}

subprojects {
    configurations.all {
        resolutionStrategy {
            // force Kotlin stdlib version
            force(
                "org.jetbrains.kotlin:kotlin-stdlib:1.9.23",
                "org.jetbrains.kotlin:kotlin-stdlib-jdk7:1.9.23",
                "org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.9.23"
            )
        }
    }
}
