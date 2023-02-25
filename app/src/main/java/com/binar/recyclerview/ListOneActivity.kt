package com.binar.recyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.binar.recyclerview.adapter.ListOneAdapter
import com.binar.recyclerview.databinding.ActivityOneBinding
import com.binar.recyclerview.databinding.ItemListOneBinding

class ListOneActivity : AppCompatActivity() {


    private lateinit var binding: ActivityOneBinding

    private val listAdapter = binarAdapter<String>(
        layout = R.layout.item_list_one,
        onBind = { view, position, item ->
            val binding = ItemListOneBinding.bind(view)
            binding.itemTvName.text = item
        }
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOneBinding.inflate(layoutInflater)
        setContentView(binding.root)

        listAdapter.addItems(Data.listName)

        val listLayoutManager = LinearLayoutManager(this)
        binding.rvOne.layoutManager = listLayoutManager

        binding.rvOne.adapter = listAdapter
    }
}