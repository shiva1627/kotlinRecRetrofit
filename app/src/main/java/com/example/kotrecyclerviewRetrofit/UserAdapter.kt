package com.example.kotrecyclerviewRetrofit

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.itemrow.view.*

class UserAdapter(private val users: List<User>) :
    RecyclerView.Adapter<UserAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val txtFirst: TextView = itemView.txtFirstName
        val txtLast: TextView = itemView.txtLastName
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.itemrow, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount() = users.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val user = users[position]
        holder.txtFirst.text = user.name
        holder.txtLast.text = user.email
    }


}
