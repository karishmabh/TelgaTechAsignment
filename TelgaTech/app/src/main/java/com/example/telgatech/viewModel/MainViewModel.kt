package com.example.telgatech.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.telgatech.data.model.GetData
import com.example.telgatech.data.repository.MainRepository
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainViewModel constructor(private val repository: MainRepository)  : ViewModel() {

    val dataList = MutableLiveData<List<GetData>>()
    val errorMessage = MutableLiveData<String>()

   /* fun getAllDetails() {
        val response = repository.getAllDetails()
        response.enqueue(object : Callback<ArrayList<GetData>> {
            override fun onResponse(call: Call<List<GetData>>, response: Response<List<GetData>>) {
                dataList.postValue(response.body())
            }
            override fun onFailure(call: Call<List<GetData>>, t: Throwable) {
                errorMessage.postValue(t.message)
            }
        })
    }*/
}