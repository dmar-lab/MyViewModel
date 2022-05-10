package dmar.myviewmodel.ui.main

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    // TODO: Implement the ViewModel
    var number = 0

    fun addOne() {
        number++
    }
}