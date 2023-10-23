package com.example.fragmenttablayout.fragments

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragmenttablayout.R
import com.example.fragmenttablayout.databinding.ActivityRegisterResultBinding

class RegisterResult : AppCompatActivity() {
    private lateinit var binding: ActivityRegisterResultBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val usn = intent.getStringExtra(RegisterFragment.EXTRA_USERNAME)
        val welcomeMessage = "$usn!"
        binding.welcometext.text = welcomeMessage

        binding.back.setOnClickListener{
            val intent = Intent(this@RegisterResult, LoginFragment::class.java)
            startActivity(intent)
            finish()
        }
    }
}