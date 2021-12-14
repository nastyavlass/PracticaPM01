package com.example.healther

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.healther.databinding.FragmentHomeSettingBinding

class HomeSettingFragment : Fragment() {
    lateinit var binding: FragmentHomeSettingBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeSettingBinding.inflate(inflater, container, false)
        return binding.root
    }

}