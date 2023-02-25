package com.binar.recyclerview.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.binar.recyclerview.Cat
import com.binar.recyclerview.R
import com.binar.recyclerview.databinding.ItemListThreeBinding

class ListThreeAdapter : RecyclerView.Adapter<ListThreeViewHolder>() {
    private val items: MutableList<Cat> = mutableListOf()
    private var onItemClickListener: ((Int, Cat) -> Unit)? = null

    fun addItems(newItems: List<Cat>) {
        items.addAll(newItems)
        notifyDataSetChanged()
    }

    fun onItemClick(itemClick: (Int, Cat) -> Unit) {
        onItemClickListener = itemClick
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListThreeViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list_three, parent, false)

        val binding = ItemListThreeBinding.bind(view)
        return ListThreeViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ListThreeViewHolder, position: Int) {
        val item = items[position]
        holder.bind(item, position, onItemClickListener)
    }

    override fun getItemCount(): Int {
        return items.size
    }
}