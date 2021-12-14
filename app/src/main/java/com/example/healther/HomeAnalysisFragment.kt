package com.example.healther

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.healther.databinding.FragmentHomeAnalysisBinding

class HomeAnalysisFragment : Fragment() {
    lateinit var binding: FragmentHomeAnalysisBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeAnalysisBinding.inflate(inflater, container, false)
        return binding.root
    }
}