package com.binar.recyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.binar.recyclerview.adapter.ListTwoAdapter
import com.binar.recyclerview.databinding.ActivityTwoBinding
import com.binar.recyclerview.databinding.ItemListTwoBinding

class ListTwoActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTwoBinding

    private val listAdapter: BinarAdapter<User> = binarAdapter(
        layout = R.layout.item_list_two,
        onBind = { view, position, item ->
            val binding = ItemListTwoBinding.bind(view)
            binding.itemTvName.text = item.name
            binding.itemTvAge.text = "Umur: ${item.age}"

            binding.root.setOnClickListener {
                //
            }
        }
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTwoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rvTwo.layoutManager = LinearLayoutManager(this)
        binding.rvTwo.adapter = listAdapter

        val newItem = Data.listNameAge
        listAdapter.addItems(newItem)
    }
}