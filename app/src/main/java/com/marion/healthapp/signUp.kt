package com.marion.healthapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.marion.healthapp.databinding.ActivityMainBinding
import com.marion.healthapp.databinding.ActivitySignUpBinding

class signUp : AppCompatActivity() {
    lateinit var binding:ActivitySignUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)
        clearErrors()
    }
    override fun onResume() {
        super.onResume()
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)
        validate()
        clearErrors()

        binding.btnsignup.setOnClickListener {
            clearErrors()
            if (validate() == false){
                Toast.makeText(this, "Welcome to Tomadachi health", Toast.LENGTH_LONG).show()
                val intent = Intent(this, login::class.java)
                startActivity(intent)
            }
            else{
                Toast.makeText(this, "Please fill all fields", Toast.LENGTH_LONG).show()
            }

        }

    }
    fun validate():Boolean{
        val firstName = binding.etfirstname.text.toString()
        val lastName = binding.etlastname.text.toString()
        val email = binding.etemail.text.toString()
        val password = binding.etpassword.text.toString()
        val passwordcon = binding.etpasswordcon.text.toString()
        var error = false


        if(firstName.isBlank()){
            binding.tilfirstname.error = "Enter first name"
            error = true
        }

        if(lastName.isBlank()){
            binding.tillastname.error = "Enter last name"
            error = true
        }

        if(email.isBlank()){
            binding.tilemail.error = "Enter e-mail address"
            error = true
        }

        if(password.isBlank()){
            binding.tilpassword.error = "Password is required"
            error = true
        }
        if(passwordcon.isBlank()){
            binding.tilpasswordcon.error = "Password is required"
            error = true
        }
        if(passwordcon != password){
            binding.tilpasswordcon.error = "Password does not match the one above"
            error = true
        }
        return error
    }
    fun clearErrors() {
        binding.tilfirstname.error = null
        binding.tillastname.error = null
        binding.tilemail.error = null
        binding.tilpassword.error = null
        binding.tilpasswordcon.error = null
    }

}