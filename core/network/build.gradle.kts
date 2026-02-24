plugins {
    alias(libs.plugins.qorvia.android.library)
}

android {
    namespace = "com.qorvia.core.network"
}

dependencies {
    implementation(libs.androidx.core.ktx)
}
