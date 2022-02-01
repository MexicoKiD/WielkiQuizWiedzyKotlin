package com.example.wielkiquizwiedzy

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ScoreFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        var scoreList = mutableListOf(
            Score("1","222"),
            Score("2","200"),
            Score("3","190"),
            Score("4","150"),
            Score("5","100"),
        )

        val adapter = ScoreAdapter(scoreList)
        val rvScore = view?.findViewById<RecyclerView>(R.id.rvScore)

        rvScore?.adapter = adapter
        rvScore?.layoutManager = LinearLayoutManager(this.context)

        return inflater.inflate(R.layout.fragment_score, container, false)
    }
}