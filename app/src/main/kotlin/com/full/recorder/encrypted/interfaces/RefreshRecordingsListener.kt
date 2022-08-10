package com.full.recorder.encrypted.interfaces

import com.full.recorder.encrypted.models.Recording

interface RefreshRecordingsListener {
    fun refreshRecordings()

    fun playRecording(recording: Recording, playOnPrepared: Boolean)
}
