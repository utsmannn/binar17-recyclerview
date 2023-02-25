package com.binar.recyclerview.adapter

import androidx.recyclerview.widget.RecyclerView
import com.binar.recyclerview.databinding.ItemListOneBinding

class ListOneViewHolder(private val binding: ItemListOneBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(item: String) {
        binding.itemTvName.text = item
    }
}