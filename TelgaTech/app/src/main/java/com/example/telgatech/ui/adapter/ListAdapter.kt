package com.example.telgatech.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.telgatech.R
import com.example.telgatech.data.model.GetData
import com.squareup.picasso.Picasso

class MainListAdapter (
    private val list: List<GetData>
): RecyclerView.Adapter<MainListAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainListAdapter.ViewHolder {
        return ViewHolder(
            LayoutInflater
                .from(parent.context)
                .inflate(R.layout.item_data_list, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var textFirstName: TextView = holder.itemView.findViewById(R.id.userNameText)
        var textLastName: TextView = holder.itemView.findViewById(R.id.userLastNameText)
        var userImage: ImageView = holder.itemView.findViewById(R.id.userImage)
        fun bindData(userList: ArrayList<GetData>?, position: Int) {
            if (userList != null) {
                textFirstName.text = userList[position].data?.get(position)?.firstName
                textLastName.text = userList[position].data?.get(position)?.lastName

                Picasso.get().load(userList[position].data?.get(position)?.avatar)
                    .placeholder(R.drawable.dummy_user)
                    .into((userImage))

            }
        }
    }


    override fun getItemCount(): Int {
        return list.size
    }
}