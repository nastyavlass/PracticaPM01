package com.example.healther

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.healther.databinding.ActivityChocolateDietBinding

class ChocolateDietActivity : AppCompatActivity() {
    lateinit var binding: ActivityChocolateDietBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChocolateDietBinding.inflate(layoutInflater)
        binding.imageDietChocBack.setOnClickListener {
            finish()
        }
        setContentView(binding.root)
    }
}