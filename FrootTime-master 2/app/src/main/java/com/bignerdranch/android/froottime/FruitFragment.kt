package com.bignerdranch.android.froottime

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class FruitFragment : Fragment() {

    private lateinit var fruit: Fruit
    private lateinit var recordButton: Button
    private lateinit var reviewButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        fruit = Fruit()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_fruit, container, false)

        recordButton = view.findViewById(R.id.record_fruit) as Button
        reviewButton = view.findViewById(R.id.review_fruit) as Button

        recordButton.apply {
            isEnabled = true
        }

        recordButton.setOnClickListener{
            val fragment = RecordFragment.newInstance()
            val fm = activity?.supportFragmentManager
            if (fm != null) {
                fm.beginTransaction()
                    .replace(R.id.fragment_container, fragment)
                    .commit()
            }
        }

        reviewButton.apply {
            isEnabled = true
        }

        reviewButton.setOnClickListener {
            val fragment = ReviewFragment.newInstance()
            val fm = activity?.supportFragmentManager
            if (fm != null) {
                fm.beginTransaction()
                    .replace(R.id.fragment_container, fragment)
                    .commit()
            }
        }


        return view
    }

    companion object {
        fun newInstance(): FruitFragment {
            return FruitFragment()
        }
    }
}