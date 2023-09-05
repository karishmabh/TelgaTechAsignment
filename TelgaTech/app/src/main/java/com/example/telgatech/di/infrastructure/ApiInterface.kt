package com.example.telgatech.di.infrastructure

import com.example.telgatech.data.model.GetData
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

public interface ApiInterface {

    @GET("users?")
    fun getDataList(@Query("page") page: Int?): Call<ArrayList<GetData>>
}