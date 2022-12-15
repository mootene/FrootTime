package com.bignerdranch.android.froottime

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class RecordFragment : Fragment() {

    private lateinit var recordButton: Button
    private lateinit var backButton: Button

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_record, container, false)

        recordButton = view.findViewById(R.id.record_button)
        backButton = view.findViewById(R.id.back_button)
        return view
    }
    override fun onStart() {
        super.onStart()
    }
    //TODO this is where you hookup the microphone
    //TODO when get frequency, set fruit frequency to read value: once set, print set to screen, return to FruitFragment

    companion object {
        fun newInstance(): RecordFragment {
            return RecordFragment()
        }
    }
}