package com.binar.recyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.binar.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnOne.setOnClickListener {
            val intent = Intent(this, ListOneActivity::class.java)
            startActivity(intent)
        }

        binding.btnTwo.setOnClickListener {
            val intent = Intent(this, ListTwoActivity::class.java)
            startActivity(intent)
        }

        binding.btnThree.setOnClickListener {
            val intent = Intent(this, ListThreeActivity::class.java)
            startActivity(intent)
        }
    }
}