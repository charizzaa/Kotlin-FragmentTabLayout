package com.example.fragmenttablayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragmenttablayout.databinding.ActivityMainBinding
import com.example.fragmenttablayout.fragments.LoginFragment
import com.example.fragmenttablayout.fragments.RegisterFragment
import com.example.fragmenttablayout.fragments.adapters.ViewPagerAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        with(binding){
            viewPager.adapter = ViewPagerAdapter(supportFragmentManager)
            tabs.setupWithViewPager(viewPager)
        }

    }
}