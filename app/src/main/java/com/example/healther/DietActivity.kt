package com.example.healther

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.healther.databinding.ActivityDietBinding

class DietActivity : AppCompatActivity() {
    lateinit var binding: ActivityDietBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityDietBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        binding.imageButtonBuckwheat.setOnClickListener {
            val intentBuck = Intent(this, BuckwheatDietActivity::class.java)
            startActivity(intentBuck)
        }
        binding.imageButtonChocolate.setOnClickListener {
            val intentChoc = Intent(this, ChocolateDietActivity::class.java)
            startActivity(intentChoc)
        }
        binding.imageDietMenuBack.setOnClickListener{
            finish()
        }
        setContentView(binding.root)
    }
}