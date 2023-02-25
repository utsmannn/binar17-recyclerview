package com.binar.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class DataViewHolder<U>(private val view: View) : ViewHolder(view) {

    fun bind(item: U, position: Int, onBind: ((View, Int, U) -> Unit)?) {
        onBind?.invoke(view, position, item)
    }
}

class BinarAdapter<U>(
    private val layout: Int,
    private val onBind: ((View, Int, U) -> Unit)
) : RecyclerView.Adapter<DataViewHolder<U>>() {
    private val items: MutableList<U> = mutableListOf()

    fun addItems(newItems: List<U>) {
        items.addAll(newItems)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder<U> {
        val view = LayoutInflater.from(parent.context)
            .inflate(layout, parent, false)

        return DataViewHolder(view)
    }

    override fun onBindViewHolder(holder: DataViewHolder<U>, position: Int) {
        val item = items[position]
        holder.bind(item, position, onBind)
    }

    override fun getItemCount(): Int {
        return items.size
    }
}

fun <U> binarAdapter(layout: Int, onBind: ((View, Int, U) -> Unit)): BinarAdapter<U> {
    return BinarAdapter(layout, onBind)
}