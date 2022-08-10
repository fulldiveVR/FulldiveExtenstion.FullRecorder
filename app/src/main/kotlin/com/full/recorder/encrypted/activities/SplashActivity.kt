package com.full.recorder.encrypted.activities

import android.content.Intent
import com.simplemobiletools.commons.activities.BaseSplashActivity
import  com.simplemobiletools.commons.extensions.*
class SplashActivity : BaseSplashActivity() {
    override fun initActivity() {

        baseConfig.appRunCount=10
        baseConfig.hadThankYouInstalled=true
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }
}
