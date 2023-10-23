package com.example.fragmenttablayout.fragments.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.fragmenttablayout.fragments.LoginFragment
import com.example.fragmenttablayout.fragments.RegisterFragment

class ViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
    override fun getCount(): Int {
        return 2
    }

    override fun getItem(position: Int): Fragment {
        return when(position){
            0 -> LoginFragment()
            1 -> RegisterFragment()
            else->throw IllegalArgumentException("Invalid tab position")
        }
    }

    override fun getPageTitle(position: Int): CharSequence?{
        return when (position) {
            0 -> "Login"
            1 -> "Register"
            else -> null
        }
    }
}