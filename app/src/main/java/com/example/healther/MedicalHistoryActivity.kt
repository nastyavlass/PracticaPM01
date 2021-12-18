package com.example.healther

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.healther.databinding.ActivityMedicalHistoryBinding
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle

class MedicalHistoryActivity : AppCompatActivity() {
    lateinit var binding: ActivityMedicalHistoryBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMedicalHistoryBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val dataTime = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            LocalDateTime.now()
        } else {
            TODO("VERSION.SDK_INT < O")
        }
        val dataDay = dataTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL))
        val medHists = listOf(
            MedicalHistory(
                dataDay = dataDay,
                text = "Visited a doctor"
            ),
            MedicalHistory(
                dataDay = dataDay,
                text = "Visited a doctor"
            ),
        )
        val adapter = MedicalHistoriesAdapter()
        binding.recyclerViewMedical.adapter = adapter
        adapter.submitList(medHists)

        binding.buttonAdd.setOnClickListener {
            adapter.addItem(
                MedicalHistory(
                    dataDay = dataDay,
                    text = "Visited a doctor"
                )
            )
        }
    }
}