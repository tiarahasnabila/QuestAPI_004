package com.example.praktikum12.di

import com.example.praktikum12.repository.MahasiswaRepository
import com.example.praktikum12.repository.NetworkKontakRepository
import com.example.praktikum12.service_api.MahasiswaService
import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import retrofit2.Retrofit

interface AppContainer{
    val kontakRepository: MahasiswaRepository
}

