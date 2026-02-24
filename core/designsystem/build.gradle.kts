plugins {
    alias(libs.plugins.qorvia.android.library)
    alias(libs.plugins.qorvia.android.compose)
}

android {
    namespace = "com.qorvia.core.designsystem"
}

dependencies {
    implementation(libs.androidx.core.ktx)
}
