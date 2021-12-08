package com.example.healther

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.healther.databinding.FragmentOnboardThreeBinding


class OnboardThreeFragment : Fragment() {
    lateinit var binding: FragmentOnboardThreeBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentOnboardThreeBinding.inflate(inflater, container, false)
        return binding.root
    }
}