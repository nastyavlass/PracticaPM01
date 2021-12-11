package com.example.healther

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.healther.databinding.ActivityHomeBinding
import com.example.healther.databinding.FragmentHomeMenuBinding

class HomeActivity : AppCompatActivity() {
    lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        binding.bottomNavigationViewHome.setOnItemSelectedListener { menu ->
            when (menu.itemId) {
                R.id.menu -> {
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.container, HomeMenuFragment())
                        .commit()
                }
                R.id.setting -> {
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.container, HomeSettingFragment())
                        .commit()
                }
                R.id.analysis -> {
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.container, HomeAnalysisFragment())
                        .commit()
                }
                R.id.notify -> {
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.container, HomeNotifyFragment())
                        .commit()
                }
            }
            true
        }
        setContentView(binding.root)
    }
}