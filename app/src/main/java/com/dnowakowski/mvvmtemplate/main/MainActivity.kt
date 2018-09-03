package com.dnowakowski.mvvmtemplate.main

import com.dnowakowski.mvvmtemplate.R
import com.dnowakowski.mvvmtemplate.base.BaseActivity
import com.dnowakowski.mvvmtemplate.databinding.ActivityMainBinding
import com.dnowakowski.mvvmtemplate.injection.activity.ActivityComponent
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject

class MainActivity : BaseActivity<ActivityMainBinding>() {

    @Inject
    lateinit var viewModel: MainViewModel

    override fun inject(component: ActivityComponent) {
        component.inject(this)
    }

    override fun provideLayout(): Int = R.layout.activity_main

    override fun bindData(binding: ActivityMainBinding) {
        binding.viewModel = viewModel
    }

    override fun subscribeViewModel(): CompositeDisposable? {
        val eventDisposable = viewModel
                .events
                .subscribe(this@MainActivity::handleViewModelEvents)
        return CompositeDisposable(eventDisposable)
    }

    private fun handleViewModelEvents(event: MainEvent) {

    }
}

