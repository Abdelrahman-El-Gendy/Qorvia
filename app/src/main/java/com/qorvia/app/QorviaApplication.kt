package com.qorvia.app

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class QorviaApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        // Init logging, crash reporting, etc.
    }
}
