package com.example.healther

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.healther.databinding.ItemMedicalHistoryBinding


class MedicalHistoriesAdapter(private val items: List<MedicalHistory>) : RecyclerView.Adapter<MedicalHistoryViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MedicalHistoryViewHolder {
        return MedicalHistoryViewHolder(ItemMedicalHistoryBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: MedicalHistoryViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount() = items.size

}

class MedicalHistoryViewHolder(private val binding: ItemMedicalHistoryBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(medicalHistory: MedicalHistory) = with(binding) {
        textDataDay.text = medicalHistory.dataDay.toString()
        textDataMonth.text = medicalHistory.dataMonth
        text.text = medicalHistory.text
        root.setOnClickListener{ }
    }
}