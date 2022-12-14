package com.example.a7monthclasswork1.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.a7monthclasswork1.databinding.ItemNotesBinding
import com.example.domain.model.Note
import kotlin.collections.List

class FirstAdapter(private val list: List<Note>) :
    RecyclerView.Adapter<FirstAdapter.FirstViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FirstViewHolder {
        return FirstViewHolder(ItemNotesBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        )
    }

    override fun onBindViewHolder(holder: FirstViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }


    inner class FirstViewHolder(private val binding: ItemNotesBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(note: Note) {
            binding.tvNotesName.text = note.title
            binding.tvNotesText.text = note.description
            binding.tvNotesTime.text = note.createAt.toString()
        }
    }
}