package com.example.healther

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.healther.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val received = intent.extras?.getString("Email")
        val fragment = supportFragmentManager.findFragmentById(binding.fragmentContainerView.id) as
                HomeMenuFragment
        fragment.email = received
        binding.bottomNavigationViewHome.setOnItemSelectedListener { menu ->
            when(menu.itemId){
                R.id.menu -> {
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.fragmentContainerView, HomeMenuFragment())
                        .commit()
                }
                R.id.setting -> {
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.fragmentContainerView, HomeSettingFragment())
                        .commit()
                }
                R.id.analysis -> {
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.fragmentContainerView, HomeAnalysisFragment())
                        .commit()
                }
                R.id.notify -> {
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.fragmentContainerView, HomeNotifyFragment())
                        .commit()
                }
            }
            true
        }

    }
}