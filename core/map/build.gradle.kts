plugins {
    alias(libs.plugins.qorvia.android.library)
}

android {
    namespace = "com.qorvia.core.map"
}

dependencies {
    implementation(libs.androidx.core.ktx)
}
