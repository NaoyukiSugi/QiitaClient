package com.example.naoyukisugi.qiitaclient

import android.app.Application
import com.example.naoyukisugi.qiitaclient.dagger.AppComponent
import com.example.naoyukisugi.qiitaclient.dagger.DaggerAppComponent

class QiitaClientApp : Application() {
    val component: AppComponent by lazy {
        DaggerAppComponent.create()
    }
}