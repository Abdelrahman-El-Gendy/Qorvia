plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
    alias(libs.plugins.hilt)
    alias(libs.plugins.ksp)
}

android {
    namespace = "com.qorvia.app"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.qorvia.app"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        debug {
            applicationIdSuffix = ".debug"
            versionNameSuffix = "-debug"
            isDebuggable = true
            buildConfigField("String", "BASE_URL", "\"https://api.dev.qorvia.com/\"")
            buildConfigField("String", "MAPS_API_KEY", "\"${project.findProperty("MAPS_API_KEY_DEBUG")}\"")
            manifestPlaceholders["MAPS_API_KEY"] = project.findProperty("MAPS_API_KEY_DEBUG")?.toString() ?: ""
        }
        release {
            isMinifyEnabled = true
            isShrinkResources = true
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
            buildConfigField("String", "BASE_URL", "\"https://api.qorvia.com/\"")
            buildConfigField("String", "MAPS_API_KEY", "\"${project.findProperty("MAPS_API_KEY_RELEASE")}\"")
            manifestPlaceholders["MAPS_API_KEY"] = project.findProperty("MAPS_API_KEY_RELEASE")?.toString() ?: ""
        }
    }

    buildFeatures {
        compose = true
        buildConfig = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_21
        targetCompatibility = JavaVersion.VERSION_21
    }

    kotlinOptions {
        jvmTarget = "21"
    }
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime)
    implementation(libs.androidx.activity.compose)
    
    implementation(platform(libs.compose.bom))
    implementation(libs.bundles.compose)

    implementation(libs.hilt.android)
    ksp(libs.hilt.compiler)

    // Network
    implementation(platform(libs.okhttp.bom))
    implementation(libs.bundles.network)

    implementation(project(":core:designsystem"))
}