package com.dnowakowski.mvvmtemplate.injection.activity

import com.dnowakowski.mvvmtemplate.injection.application.ApplicationComponent
import com.dnowakowski.mvvmtemplate.main.MainActivity
import dagger.Component

@ActivityScope
@Component(modules = [(ActivityModule::class)], dependencies = [(ApplicationComponent::class)])
interface ActivityComponent {
    fun inject(activity: MainActivity)
}