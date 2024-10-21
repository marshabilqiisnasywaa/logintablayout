package com.example.logintablayout

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.logintablayout.RegisterFragment
import com.example.logintablayout.LoginFragment


class SectionsPagerAdapter(activity: AppCompatActivity) : FragmentStateAdapter(activity) {

    override fun getItemCount(): Int = 2  // Use concise syntax

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> RegisterFragment()  // Fixed syntax
            1 -> LoginFragment()     // Fixed syntax
            else -> throw IllegalArgumentException("Invalid position: $position")  // Handle invalid cases
        }
    }
}
