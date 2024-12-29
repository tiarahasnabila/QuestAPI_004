package com.example.praktikum12

import android.app.Application
import com.example.praktikum12.di.AppContainer
import com.example.praktikum12.di.MahasiswaContainer

class MahasiswaApplications:Application() {
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container=MahasiswaContainer()
    }
}