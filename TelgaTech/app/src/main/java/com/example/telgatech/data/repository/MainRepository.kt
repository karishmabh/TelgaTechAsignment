package com.example.telgatech.data.repository

import com.example.telgatech.di.infrastructure.ApiInterface

class MainRepository constructor(private val retrofitService: ApiInterface) {
    fun getAllDetails() = retrofitService.getDataList(2)
}
