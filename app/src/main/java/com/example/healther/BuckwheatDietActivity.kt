package com.example.healther

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.healther.databinding.ActivityBuckwheatDietBinding

class BuckwheatDietActivity : AppCompatActivity() {
    lateinit var binding: ActivityBuckwheatDietBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityBuckwheatDietBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        binding.imageDietBuckBack.setOnClickListener {
            finish()
        }
        setContentView(binding.root)
    }
}