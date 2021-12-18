package com.example.healther

import android.os.Build
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.healther.databinding.ItemMedicalHistoryBinding



class MedicalHistoriesAdapter() : RecyclerView.Adapter<MedicalHistoryViewHolder>(){
    private val items = mutableListOf<MedicalHistory>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MedicalHistoryViewHolder {
        return MedicalHistoryViewHolder(ItemMedicalHistoryBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: MedicalHistoryViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount() = items.size

    fun submitList(MedicalHistories: List<MedicalHistory>){
        items.clear()
        items.addAll(MedicalHistories)
        notifyDataSetChanged()
    }

    fun addItem(medicalHistory: MedicalHistory){
        items.add(medicalHistory)
        notifyItemInserted(items.lastIndex)
    }

}

class MedicalHistoryViewHolder(private val binding: ItemMedicalHistoryBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(medicalHistory: MedicalHistory) = with(binding) {
        textDataDay.text = medicalHistory.dataDay
        text.text = medicalHistory.text
        root.setOnClickListener{ }
    }
}