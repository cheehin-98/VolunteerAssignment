package com.example.volunteerassignment.ui.MyActivity

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyActivityViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is My Activity Fragment"
    }
    val text: LiveData<String> = _text
}