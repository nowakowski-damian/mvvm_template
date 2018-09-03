package com.dnowakowski.mvvmtemplate.injection.dialog

import com.dnowakowski.mvvmtemplate.injection.activity.ActivityComponent
import dagger.Component

@DialogScope
@Component(modules = [(DialogModule::class)], dependencies = [(ActivityComponent::class)] )
interface DialogComponent {
}