package com.example.healther

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.healther.databinding.FragmentHomeMenuBinding

class HomeMenuFragment : Fragment() {
    var email: String? = null
    lateinit var binding: FragmentHomeMenuBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeMenuBinding.inflate(inflater, container, false)
        binding.toolbarHome.title = getString(R.string.home_title, email)
        return binding.root
    }
}