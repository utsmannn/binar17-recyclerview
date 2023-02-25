package com.binar.recyclerview

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.binar.recyclerview.adapter.ListThreeAdapter
import com.binar.recyclerview.databinding.ActivityThreeBinding
import com.binar.recyclerview.databinding.ItemListThreeBinding
import com.bumptech.glide.Glide

class ListThreeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityThreeBinding

    //private val listAdapter = ListThreeAdapter()

    private val listAdapter = binarAdapter<Cat>(
        layout = R.layout.item_list_three,
        onBind = { view, position, item ->
            val binding = ItemListThreeBinding.bind(view)

            Glide.with(this)
                .load(item.url)
                .into(binding.itemImgCat)
        }
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThreeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rvThree.layoutManager = GridLayoutManager(this, 2)
        binding.rvThree.adapter = listAdapter

        val newItems = Data.listCat
        listAdapter.addItems(newItems)

        /*listAdapter.onItemClick { position, item ->
            Toast.makeText(this, "ini item ke: $position", Toast.LENGTH_SHORT).show()
        }*/
    }
}