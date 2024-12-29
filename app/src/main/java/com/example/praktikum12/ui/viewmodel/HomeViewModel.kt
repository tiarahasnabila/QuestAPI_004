package com.example.praktikum12.ui.viewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.praktikum12.model.Mahasiswa
import com.example.praktikum12.repository.MahasiswaRepository


sealed class HomeUiState{
    data class Success(val mahasiswa: List<Mahasiswa>): HomeUiState()
    object Error : HomeUiState()
    object Loading : HomeUiState()
}

class HomeViewModel(private val mhs: MahasiswaRepository): ViewModel(){
    var mhsUiState:HomeUiState by mutableStateOf(HomeUiState.Loading)
        private set

    init {
        getMhs()
    }
}
