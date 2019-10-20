package com.example.lifecycle

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

class LifeCycleTimer(lifeCycle: Lifecycle): LifecycleObserver{
    init {
        lifeCycle.addObserver(this)
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun startTimer(){

    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun stopTimer(){

    }
}