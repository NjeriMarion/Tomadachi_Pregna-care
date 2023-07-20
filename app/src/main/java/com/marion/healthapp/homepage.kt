package com.marion.healthapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.marion.healthapp.databinding.ActivityHomepageBinding
import com.marion.healthapp.databinding.ActivityMainBinding

class homepage : AppCompatActivity() {
    lateinit var binding: ActivityHomepageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomepageBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        binding = ActivityHomepageBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.ivmenu.setOnClickListener {
            val intent = Intent(this, hammenu::class.java)
            startActivity(intent)
        }
    }
}