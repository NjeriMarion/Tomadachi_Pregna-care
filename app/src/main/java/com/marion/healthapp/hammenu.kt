package com.marion.healthapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.marion.healthapp.databinding.ActivityHammenuBinding
import com.marion.healthapp.databinding.ActivityMainBinding

class hammenu : AppCompatActivity() {
    lateinit var binding: ActivityHammenuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHammenuBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        binding = ActivityHammenuBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.cpgroupa.setOnClickListener {
            val intent = Intent(this, homepage::class.java)
            startActivity(intent)
        }
        binding.cpgroupd.setOnClickListener {
            val intent = Intent(this, login::class.java)
            startActivity(intent)
        }
        binding.cpgroupc.setOnClickListener {
           Toast.makeText(this, "About us displayed", Toast.LENGTH_LONG).show()
        }
        binding.cpgroupb.setOnClickListener {
            Toast.makeText(this, "Contacts page displayed", Toast.LENGTH_LONG).show()
        }
    }
}