package com.binar.recyclerview.adapter

import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.binar.recyclerview.Cat
import com.binar.recyclerview.databinding.ItemListThreeBinding
import com.bumptech.glide.Glide

class ListThreeViewHolder(private val binding: ItemListThreeBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(item: Cat, position: Int, onItemClickListener: ((Int, Cat) -> Unit)?) {
        Glide.with(binding.root.context)
            .load(item.url)
            .into(binding.itemImgCat)

        binding.root.setOnClickListener {
            onItemClickListener?.invoke(position, item)
        }
    }
}