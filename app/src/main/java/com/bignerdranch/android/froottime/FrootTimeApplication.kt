package com.bignerdranch.android.froottime

import android.app.Application

class FrootTimeApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        FrequencyRepository.initialize(this)
    }
}