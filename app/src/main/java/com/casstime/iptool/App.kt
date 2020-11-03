package com.casstime.iptool

import android.app.Application
import com.networkbench.agent.impl.NBSAppAgent

class App:Application() {
    override fun onCreate() {
        super.onCreate()
        NBSAppAgent.setLicenseKey("bba0b062e4154990b0df587a21a2f7f5").start(this)
    }
}