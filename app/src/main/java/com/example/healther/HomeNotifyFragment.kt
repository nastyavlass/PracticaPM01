package com.example.healther

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.healther.databinding.FragmentHomeNotifyBinding

class HomeNotifyFragment : Fragment() {
    lateinit var binding: FragmentHomeNotifyBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeNotifyBinding.inflate(inflater, container, false)

        return binding.root
    }
}