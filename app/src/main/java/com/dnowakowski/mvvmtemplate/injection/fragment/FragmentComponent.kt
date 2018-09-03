package com.dnowakowski.mvvmtemplate.injection.fragment

import com.dnowakowski.mvvmtemplate.injection.activity.ActivityComponent
import dagger.Component

@FragmentScope
@Component(modules = [(FragmentModule::class)], dependencies = [(ActivityComponent::class)] )
interface FragmentComponent {
}