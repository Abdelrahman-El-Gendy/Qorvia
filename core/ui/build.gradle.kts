plugins {
    alias(libs.plugins.qorvia.android.library)
}

android {
    namespace = "com.qorvia.core.ui"
}

dependencies {
    implementation(libs.androidx.core.ktx)
}
