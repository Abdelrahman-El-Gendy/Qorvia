pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Qorvia"
include(":app")

include(
    ":core:designsystem",
    ":core:ui",
    ":core:map",
    ":core:network",
    ":core:data",
    ":core:domain",
    ":core:common",
    ":core:testing"
)

include(
    ":feature:auth",
    ":feature:rider-booking",
    ":feature:rider-tracking",
    ":feature:driver-requests",
    ":feature:driver-trip",
    ":feature:driver-earnings",
    ":feature:driver-profile",
    ":feature:payments",
    ":feature:profile",
    ":feature:safety",
    ":feature:notifications"
)
