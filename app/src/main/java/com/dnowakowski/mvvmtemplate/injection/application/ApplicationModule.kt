package com.dnowakowski.mvvmtemplate.injection.application

import com.dnowakowski.mvvmtemplate.App
import dagger.Module
import dagger.Provides

@Module
class ApplicationModule( private val app: App ) {

    @Provides
    @ApplicationScope
    fun provideApplication(): App = app

}