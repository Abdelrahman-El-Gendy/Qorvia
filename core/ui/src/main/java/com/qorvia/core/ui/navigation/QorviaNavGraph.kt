package com.qorvia.core.ui.navigation

sealed class Screen(val route: String) {

    // Auth
    object Splash : Screen("splash")
    object Language : Screen("language")
    object Welcome : Screen("welcome")
    object PhoneEntry : Screen("phone_entry")
    object OtpVerification : Screen("otp_verification/{phoneNumber}") {
        fun createRoute(phoneNumber: String) = "otp_verification/$phoneNumber"
    }

    // Rider
    object RiderHome : Screen("rider_home")
    object RiderSearch : Screen("rider_search")
    object RideOptions : Screen("ride_options")
    object RiderTracking : Screen("rider_tracking/{tripId}") {
        fun createRoute(tripId: String) = "rider_tracking/$tripId"
    }
    object TripComplete : Screen("trip_complete/{tripId}") {
        fun createRoute(tripId: String) = "trip_complete/$tripId"
    }

    // Driver
    object DriverHome : Screen("driver_home")
    object DriverNavigation : Screen("driver_navigation/{tripId}") {
        fun createRoute(tripId: String) = "driver_navigation/$tripId"
    }

    // Shared
    object Profile : Screen("profile")
    object TripHistory : Screen("trip_history")
    object Wallet : Screen("wallet")
    object Settings : Screen("settings")
}
