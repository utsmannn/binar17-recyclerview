package com.binar.recyclerview.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.binar.recyclerview.R
import com.binar.recyclerview.User
import com.binar.recyclerview.databinding.ItemListTwoBinding

class ListTwoAdapter : RecyclerView.Adapter<ListTwoViewHolder>() {
    private val items: MutableList<User> = mutableListOf()

    fun addItems(newItems: List<User>) {
        items.addAll(newItems)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListTwoViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list_two, parent, false)

        val binding = ItemListTwoBinding.bind(view)
        return ListTwoViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ListTwoViewHolder, position: Int) {
        val item = items[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int {
        return items.size
    }
}