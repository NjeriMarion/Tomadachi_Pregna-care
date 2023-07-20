package com.marion.healthapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.marion.healthapp.databinding.ActivityLoginBinding
import com.marion.healthapp.databinding.ActivitySignUpBinding

class login : AppCompatActivity() {
    lateinit var binding:ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        validate()
        binding.btnlogin.setOnClickListener {
            if (validate() == false){
                val intent = Intent(this, homepage::class.java)
                startActivity(intent)
                Toast.makeText(this, "Welcome. How can we help today ?",Toast.LENGTH_LONG ).show()
            }
            else{
                Toast.makeText(this, "Fill all fields correctly", Toast.LENGTH_LONG).show()
            }

        }

    }
    fun validate():Boolean{
        val email = binding.etemaillog.text.toString()
        val password = binding.etpass.text.toString()
        var error = false

        if (email.isBlank()){
            binding.tilemailog.error = "E-mail is required"
            error = true
        }

        if (password.isBlank()){
            binding.tilpass.error = "Password is required"
            error = true
        }
        return error
    }
}