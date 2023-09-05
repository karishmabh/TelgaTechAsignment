package com.example.telgatech.di.infrastructure


import okhttp3.Call
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Converter
import com.google.gson.GsonBuilder
import retrofit2.converter.gson.GsonConverterFactory


public class ApiClient {
    public var BASE_URL: String = "https://reqres.in/api/"
    public var retrofit: Retrofit? = null

    public fun getApiClient(): Retrofit? {
        if (retrofit == null) {
            retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create()).build()
        }
        return retrofit
    }
}



