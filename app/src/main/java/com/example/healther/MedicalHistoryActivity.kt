package com.example.healther

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.healther.databinding.ActivityMedicalHistoryBinding

class MedicalHistoryActivity : AppCompatActivity() {
    lateinit var binding: ActivityMedicalHistoryBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMedicalHistoryBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val medHists = listOf(
            MedicalHistory(
                dataDay = 3,
                dataMonth = "April",
                text = "poseshenie 1"
            ),
            MedicalHistory(
                dataDay = 8,
                dataMonth = "May",
                text = "poseshenie 2"
            ),
        )
        binding.recyclerViewMedical.adapter = MedicalHistoriesAdapter(medHists)
    }
}