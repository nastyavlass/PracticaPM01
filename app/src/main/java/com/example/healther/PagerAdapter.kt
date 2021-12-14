package com.example.healther

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class PagerAdapter(fragment: Fragment) : FragmentStateAdapter(fragment){
    override fun getItemCount() = 3
    override fun createFragment(position: Int): Fragment {
        when (position){
            0 -> return OnboardOneFragment()
            1 -> return OnboardTwoFragment()
            2 -> return OnboardThreeFragment()
            else -> return OnboardTwoFragment()
        }
    }
}