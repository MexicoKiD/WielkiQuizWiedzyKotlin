package com.example.wielkiquizwiedzy

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import kotlin.system.exitProcess

class MenuFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_menu, container, false)

        val scoreButton = view.findViewById<Button>(R.id.buttonScore)
        val infoButton = view.findViewById<Button>(R.id.buttonInfo)
        val exitButton = view.findViewById<Button>(R.id.buttonExit)

        scoreButton.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_menuFragment_to_scoreFragment)
        }

        infoButton.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_menuFragment_to_infoFragment)
        }

        exitButton.setOnClickListener {
            exitProcess(0)
        }

        return view
    }
}