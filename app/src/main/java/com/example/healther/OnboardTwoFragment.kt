package com.example.healther

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.healther.databinding.FragmentOnboardTwoBinding

class OnboardTwoFragment : Fragment(){
    lateinit var binding: FragmentOnboardTwoBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentOnboardTwoBinding.inflate(inflater, container, false)
        binding.textSkipOnboard2.setOnClickListener {
            val intentSplash = Intent(context, SplashActivity::class.java)
            startActivity(intentSplash)
        }
        return binding.root
    }
}