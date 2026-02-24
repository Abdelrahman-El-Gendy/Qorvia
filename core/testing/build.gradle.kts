plugins {
    alias(libs.plugins.qorvia.android.library)
}

android {
    namespace = "com.qorvia.core.testing"
}

dependencies {
    implementation(libs.androidx.core.ktx)
}
