package com.example.ngopii

import android.app.Application
import com.google.android.gms.ads.MobileAds

class myApplications : Application() {
    override fun onCreate() {
        super.onCreate()
        MobileAds.initialize(this)
    }
}