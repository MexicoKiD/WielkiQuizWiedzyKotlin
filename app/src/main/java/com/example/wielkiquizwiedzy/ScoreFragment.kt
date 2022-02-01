package com.example.wielkiquizwiedzy

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.wielkiquizwiedzy.databinding.FragmentScoreBinding

class ScoreFragment : Fragment() {

    private lateinit var binding: FragmentScoreBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        binding = FragmentScoreBinding.inflate(inflater, container, false)


        val rvScore = binding.rvScore

        var scoreList = mutableListOf(
            Score("1","222"),
            Score("2","200"),
            Score("3","190"),
            Score("4","150"),
            Score("5","100"),
        )

        rvScore.adapter = ScoreAdapter(scoreList)
        rvScore.layoutManager = LinearLayoutManager(this.context)

        return inflater.inflate(R.layout.fragment_score, container, false)
    }
}