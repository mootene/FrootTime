package com.bignerdranch.android.froottime

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
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

        backButton.setOnClickListener{
            val fragment = FruitFragment.newInstance()
            val fm = activity?.supportFragmentManager
            if (fm != null) {
                fm.beginTransaction()
                    .replace(R.id.fragment_container, fragment)
                    .commit()
            }
        }

        recordButton.setOnClickListener{
            //TODO what happens when hit record???
            //TODO this is where you hookup the microphone
            //TODO when get frequency, set fruit frequency to read value: once set, print set to screen, return to FruitFragment
            //TODO unblock loop below
            /*
            while (dont good frequency reading) {
                Toast.makeText(this,
                    R.string.still_recording_toast,
                    Toast.LENGTH_LONG)
                    .show()
            }
             */
            //after get set frequency, stop recording
            // toast to screen like in the quiz (good!, bad!, still recording...)
            if (/*TODO UPDATE CONDITION*/ true) { // frequency is in some good range{
                Toast.makeText(this,
                    R.string.good_toast,
                    Toast.LENGTH_SHORT)
                    .show()
            }
            else {
                Toast.makeText(
                    this,
                    R.string.bad_toast,
                    Toast.LENGTH_SHORT)
                    .show()
            }
        }
    }


    companion object {
        fun newInstance(): RecordFragment {
            return RecordFragment()
        }
    }
}