plugins {
    alias(libs.plugins.qorvia.android.library)
}

android {
    namespace = "com.qorvia.core.common"
}

dependencies {
    implementation(libs.androidx.core.ktx)
}
