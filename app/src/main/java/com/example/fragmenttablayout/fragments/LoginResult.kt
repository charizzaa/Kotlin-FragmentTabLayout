package com.example.fragmenttablayout.fragments

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragmenttablayout.R
import com.example.fragmenttablayout.databinding.ActivityLoginResultBinding
import com.example.fragmenttablayout.databinding.FragmentLoginBinding

class LoginResult : AppCompatActivity() {
    private lateinit var binding: ActivityLoginResultBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginResultBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_login_result)

        val usn = intent.getStringExtra(LoginFragment.EXTRA_USERNAME)
        binding.txtUsn.text = "$usn!"

        binding.back.setOnClickListener{
            val intent = Intent(this@LoginResult, LoginFragment::class.java)
            startActivity(intent)
            finish()
        }
    }
}