package com.dnowakowski.mvvmtemplate

import android.app.Application
import com.dnowakowski.mvvmtemplate.injection.application.ApplicationComponent
import com.dnowakowski.mvvmtemplate.injection.application.ApplicationModule
import com.dnowakowski.mvvmtemplate.injection.application.DaggerApplicationComponent
import timber.log.Timber

class App: Application() {

    val component: ApplicationComponent by lazy {
        DaggerApplicationComponent
                .builder()
                .applicationModule(ApplicationModule(this))
                .build()
    }

    override fun onCreate() {
        super.onCreate()
        component.inject(this)
        initTimber()
    }

    private fun initTimber() {
        if (BuildConfig.DEBUG)
            Timber.plant(Timber.DebugTree())
    }
}