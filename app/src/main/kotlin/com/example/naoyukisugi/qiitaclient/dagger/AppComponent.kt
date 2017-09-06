package com.example.naoyukisugi.qiitaclient.dagger

import com.example.naoyukisugi.qiitaclient.MainActivity
import dagger.Component
import javax.inject.Singleton

@Component(modules = arrayOf(ClientModule::class))
@Singleton
interface AppComponent {
    fun inject(mainActivity: MainActivity)
}