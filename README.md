# Qorvia 🚖

A multi-module Android application utilizing modern development practices including Jetpack Compose, Clean Architecture, Hilt DI, and modular Kotlin DSL setup.

## 🏗 Modular Architecture Overview
This app strictly follows modularization by separating features and core infrastructure to maintain scalability and build speeds.

### `app/`
The main application module holding `QorviaApplication`, `MainActivity`, and dependency wiring.

### `core/`
Reusable logic across the application:
- `designsystem/` : UI tokens, customized Material 3 themes, shapes, and colors.
- `ui/` : Shared scaffolds, navigation graphs, and UI states.
- `map/` : Google Maps abstractions.
- `network/` : API client and retrofit setup.
- `data/` & `domain/` : Repositories, Use Cases, Models.
- `common/` : Global extensions.
- `testing/` : Test fixtures.

### `feature/`
Self-contained functional units of the app:
- `auth/` : Login, Register, OTP.
- `rider-booking/` & `rider-tracking/` : Rider workflows.
- `driver-requests/`, `driver-trip/`, `driver-earnings/`, `driver-profile/` : Driver components.
- `payments/` : Wallets & Checkouts.
- `profile/` : User settings.
- `safety/` & `notifications/` : System utilities and emergency workflows.

## 🛠 Tech Stack
- **UI Toolkit:** Jetpack Compose
- **Build System:** Gradle Kotlin DSL + Version Catalogs
- **Dependency Injection:** Hilt 
- **Networking:** Retrofit2 + OkHttp3
- **Local Storage:** DataStore Preferences & Room Database
- **Mapping:** Google Play Services Location + Maps Compose
