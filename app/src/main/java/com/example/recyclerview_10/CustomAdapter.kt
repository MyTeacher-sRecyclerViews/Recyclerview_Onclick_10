package com.example.recyclerview_10

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(val activity: MainActivity, val users: ArrayList<User>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return CustomViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        val user = users[position]

        if (holder is CustomViewHolder) {
            holder.textOne.text = user.nameOne
            holder.textTwo.text = user.nameTwo

            holder.itemView.setOnClickListener {
                activity.openItemDetails(user)
            }
        }
    }

    override fun getItemCount(): Int {
        return users.size
    }

    class CustomViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textOne: TextView = view.findViewById(R.id.text_one)
        val textTwo: TextView = view.findViewById(R.id.text_two)
    }
}