import os

modules = [
    "feature/driver-earnings",
    "feature/driver-profile",
    "feature/safety",
    "feature/notifications"
]

base_dir = r"c:\Users\Abdelrahman\Downloads\Android\Android Projects\Compose\Qorvia"

build_gradle_content = """plugins {
    alias(libs.plugins.android.library)
}

android {
    namespace = "com.qorvia.{namespace_suffix}"
    compileSdk = 36

    defaultConfig {
        minSdk = 24

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {
    implementation(libs.androidx.core.ktx)
}
"""

for mod in modules:
    mod_path = os.path.join(base_dir, mod.replace("/", "\\"))
    os.makedirs(mod_path, exist_ok=True)
    
    # Also create src/main/java source directory
    os.makedirs(os.path.join(mod_path, "src", "main", "java", "com", "qorvia", mod.replace("/", "\\").replace("-", "")), exist_ok=True)
    
    # write consumer-rules.pro
    with open(os.path.join(mod_path, "consumer-rules.pro"), "w") as f:
        f.write("# Consumer rules for " + mod + "\n")
        
    # write proguard-rules.pro
    with open(os.path.join(mod_path, "proguard-rules.pro"), "w") as f:
        f.write("# Proguard rules for " + mod + "\n")
    
    namespace_suffix = mod.replace("/", ".").replace("-", "")
    with open(os.path.join(mod_path, "build.gradle.kts"), "w") as f:
        f.write(build_gradle_content.replace("{namespace_suffix}", namespace_suffix))

print("New modules initialized successfully.")
