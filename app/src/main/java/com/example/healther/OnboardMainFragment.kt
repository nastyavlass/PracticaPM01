package com.example.healther

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.healther.databinding.FragmentOnboardMainBinding

class OnboardMainFragment : Fragment() {
    lateinit var binding: FragmentOnboardMainBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentOnboardMainBinding.inflate(inflater, container, false)
        binding.viewPager.adapter = PagerAdapter(this)
        return binding.root
    }
}