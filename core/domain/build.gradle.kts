plugins {
    alias(libs.plugins.qorvia.android.library)
}

android {
    namespace = "com.qorvia.core.domain"
}

dependencies {
    implementation(libs.androidx.core.ktx)
}
