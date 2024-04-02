package com.ft.puzzlegame

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ft.puzzlegame.databinding.FragmentPuzzleBinding


class PuzzleFragment : Fragment() {

    private val logTag = "PuzzleFragment"

    private lateinit var binding: FragmentPuzzleBinding
    private lateinit var mainActivity: MainActivity

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mainActivity = (requireActivity() as MainActivity)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(logTag, "onCreate")
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?{
        binding = FragmentPuzzleBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val puzzleBoardView = PuzzleBoardView(requireContext(), mainActivity.n)
        binding.puzzleContainer.addView(puzzleBoardView)

        binding.buttonNewGame.setOnClickListener {
            puzzleBoardView.initGame()
            puzzleBoardView.invalidate()
        }
    }
}
