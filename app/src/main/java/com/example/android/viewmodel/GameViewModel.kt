package com.example.android.viewmodel

import androidx.lifecycle.ViewModel
import timber.log.Timber


//For every configuration change,
// new ViewModel is created, if we create ViewModel from constructor
// instead create ViewModel instance using a ViewModelProvider
// ViewModel is retained as long as the scope is alive. If the scope is a fragment, then ViewModel is
// retained until the fragment is detached

class GameViewModel : ViewModel() {

    //ViewModel - onCleared() callback is called to clean up the resources
    override fun onCleared() {
        super.onCleared()
        Timber.i("GameViewModel onCleared")
    }

}