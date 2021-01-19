package com.example.studyjamsession3.pathway6

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Pathway6ViewModel: ViewModel() {
    private val _number = MutableLiveData<Int>()
    val number: LiveData<Int>
        get() = _number
    private val _eventBelowZero = MutableLiveData<Boolean>()
    val eventBelowZero: LiveData<Boolean>
        get() = _eventBelowZero
    init{
        _number.value = 0
        _eventBelowZero.value = false
    }

    /** Methods for buttons presses **/
    fun decrement() {
        if(number.value?.compareTo(0)!! <= 0){
            onZero()
        }else{
            _number.value = (number.value)?.minus(1)
        }

    }

    private fun onZero() {
        _eventBelowZero.value = true
    }

    fun increment() {
        _number.value = (number.value)?.plus(1)
        if(number.value?.equals(1) == true){
            notZero()
        }
    }

    private fun notZero() {
        _eventBelowZero.value = false
    }
}