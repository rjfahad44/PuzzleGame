package com.ft.puzzlegame

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ft.puzzlegame.databinding.FragmentMainBinding


class MainFragment : Fragment() {

    private val logTag = "MainFragment"

    private lateinit var binding: FragmentMainBinding
    private lateinit var mainActivity: MainActivity

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mainActivity = (requireActivity() as MainActivity)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(logTag, "onCreate")
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = FragmentMainBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.buttonThreeXThree.setOnClickListener {
            mainActivity.showPuzzleFragment(3)
        }
        binding.buttonFourXFour.setOnClickListener {
            mainActivity.showPuzzleFragment(4)
        }
        binding.buttonFiveXFive.setOnClickListener {
            mainActivity.showPuzzleFragment(5)
        }
    }
}
