package com.bignerdranch.android.froottime

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment

class RecordFragment : Fragment() {

    private lateinit var recordButton: EditText
    private lateinit var backButton: Button

    private lateinit var fruit: Fruit

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_record, container, false)
        fruit = Fruit()
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

        val textWatcher = object : TextWatcher {
            override fun onTextChanged(sequence: CharSequence?, p1: Int, p2: Int, p3: Int) {
                //TODO update database current value
                fruit.frequency = sequence.toString().toInt()
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun afterTextChanged(p0: Editable?) {
            }
        }
        recordButton.addTextChangedListener(textWatcher)
    }


    companion object {
        fun newInstance(): RecordFragment {
            return RecordFragment()
        }
    }
}