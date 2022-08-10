package com.full.recorder.encrypted.activities

import android.content.Intent
import com.full.recorder.encrypted.services.RecorderService

class BackgroundRecordActivity : SimpleActivity() {
    companion object {
        const val RECORD_INTENT_ACTION = "RECORD_ACTION"
    }

    override fun onResume() {
        super.onResume()
        if (intent.action == RECORD_INTENT_ACTION) {
            Intent(this@BackgroundRecordActivity, RecorderService::class.java).apply {
                try {
                    if (RecorderService.isRunning) {
                        stopService(this)
                    } else {
                        startService(this)
                    }
                } catch (ignored: Exception) {
                }
            }
        }
        moveTaskToBack(true)
        finish()
    }
}
