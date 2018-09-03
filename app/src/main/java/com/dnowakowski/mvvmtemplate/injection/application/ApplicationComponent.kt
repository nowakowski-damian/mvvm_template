package com.dnowakowski.mvvmtemplate.injection.application

import com.dnowakowski.mvvmtemplate.App
import dagger.Component

@ApplicationScope
@Component(modules = [(ApplicationModule::class)])
interface ApplicationComponent {
    fun inject(app: App)
}