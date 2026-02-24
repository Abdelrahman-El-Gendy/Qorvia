plugins {
    alias(libs.plugins.qorvia.android.library)
}

android {
    namespace = "com.qorvia.core.data"
}

dependencies {
    implementation(libs.androidx.core.ktx)
}
