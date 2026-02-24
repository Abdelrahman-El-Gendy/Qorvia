plugins {
    `kotlin-dsl`
}

group = "com.qorvia.buildlogic"

dependencies {
    compileOnly("com.android.tools.build:gradle:8.7.0")
    compileOnly("org.jetbrains.kotlin:kotlin-gradle-plugin:2.0.21")
    compileOnly("com.google.devtools.ksp:com.google.devtools.ksp.gradle.plugin:2.0.21-1.0.27")
}

gradlePlugin {
    plugins {
        register("androidApplication") {
            id = "qorvia.android.application"
            implementationClass = "AndroidApplicationConventionPlugin"
        }
        register("androidLibrary") {
            id = "qorvia.android.library"
            implementationClass = "AndroidLibraryConventionPlugin"
        }
        register("androidFeature") {
            id = "qorvia.android.feature"
            implementationClass = "AndroidFeatureConventionPlugin"
        }
        register("androidCompose") {
            id = "qorvia.android.compose"
            implementationClass = "AndroidComposeConventionPlugin"
        }
        register("androidHilt") {
            id = "qorvia.hilt"
            implementationClass = "AndroidHiltConventionPlugin"
        }
    }
}
