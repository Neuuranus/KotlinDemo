package com.uranus.kotlindemo

import android.app.Application
import android.content.res.Configuration
import android.util.Log

class KotlinDemo: Application(){
    override fun onCreate() {
        super.onCreate()
    }

    override fun onConfigurationChanged(newConfig: Configuration?) {
        super.onConfigurationChanged(newConfig)
        Log.i("Demo", "application onConfigurationChanged")
        Log.i("Demo", "app config " + Log.getStackTraceString(Throwable()))
    }
}
