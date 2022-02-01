package com.example.wielkiquizwiedzy

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.wielkiquizwiedzy.databinding.RowBinding

class ScoreAdapter(
    var scores: List<Score>
): RecyclerView.Adapter<ScoreAdapter.ScoreViewHolder>() {

    inner class ScoreViewHolder(val binding: RowBinding ) : RecyclerView.ViewHolder(binding.root)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ScoreViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = RowBinding.inflate(layoutInflater, parent, false)
        return ScoreViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ScoreViewHolder, position: Int) {
        holder.binding.apply {
            number.text = scores[position].number
            score.text = scores[position].score
        }
    }

    override fun getItemCount(): Int {
        return scores.size
    }
}