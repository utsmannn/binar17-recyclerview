package com.binar.recyclerview.adapter

import androidx.recyclerview.widget.RecyclerView
import com.binar.recyclerview.User
import com.binar.recyclerview.databinding.ItemListTwoBinding

class ListTwoViewHolder(private val binding: ItemListTwoBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(item: User) {
        binding.itemTvName.text = item.name
        binding.itemTvAge.text = "Umur: ${item.age}"
    }
}