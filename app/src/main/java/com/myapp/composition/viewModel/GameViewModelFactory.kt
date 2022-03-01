package com.myapp.composition.viewModel

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.myapp.domain.entity.Level

class GameViewModelFactory(
    private val level: Level,
    private val application: Application
): ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(GameViewModel::class.java)) {
            return GameViewModel(application, level) as T
        }
        throw RuntimeException("Unknown view model class $modelClass")
    }
}