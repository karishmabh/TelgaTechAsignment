package com.example.telgatech.ui.activity

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.telgatech.R
import com.example.telgatech.data.model.GetData
import com.example.telgatech.di.infrastructure.ApiClient
import com.example.telgatech.di.infrastructure.ApiInterface
import com.example.telgatech.ui.adapter.MainListAdapter
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity(){
    var listData: ArrayList<GetData> = ArrayList()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var recyclerView: RecyclerView = findViewById(R.id.recyclerview_demo)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
        var apiInterface: ApiInterface = ApiClient().getApiClient()!!.create(ApiInterface::class.java)
        apiInterface.getDataList(2).enqueue(object : Callback<ArrayList<GetData>> {
            override fun onResponse(call: Call<ArrayList<GetData>>?, response: Response<ArrayList<GetData>>?) {

                listData = response?.body()!!
                Toast.makeText(this@MainActivity, listData.toString(), Toast.LENGTH_SHORT).show()

                recyclerView.adapter = MainListAdapter(listData)


            }

            override fun onFailure(call: Call<ArrayList<GetData>>?, t: Throwable?) {
                Toast.makeText(this@MainActivity, call.toString(), Toast.LENGTH_SHORT).show()

            }
        })


    }

    }