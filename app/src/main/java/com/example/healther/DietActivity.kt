package com.example.healther

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.healther.databinding.ActivityDietBinding

class DietActivity : AppCompatActivity() {
    lateinit var binding: ActivityDietBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityDietBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}