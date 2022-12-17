package com.bignerdranch.android.froottime

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.CheckBox
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

private const val TAG = "REVIEW FRAGMENT"
class ReviewFragment : Fragment() {
    private val frequencyRepository = FrequencyRepository.get()
    val frequencyListLiveData = frequencyRepository.getFrequencies()



    private lateinit var fruit: Fruit

    private lateinit var tooSweet: CheckBox
    private lateinit var tooBitter: CheckBox
    private lateinit var tooSoft: CheckBox
    private lateinit var tooCrunchy: CheckBox
    private lateinit var perfect: CheckBox

    private lateinit var backButton: Button

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_review, container, false)

        tooSweet = view.findViewById(R.id.review_tooSweet)
        tooBitter = view.findViewById(R.id.review_tooBitter)
        tooSoft = view.findViewById(R.id.review_tooSoft)
        tooCrunchy = view.findViewById(R.id.review_tooCrunchy)
        perfect = view.findViewById(R.id.review_Perfect)

        backButton = view.findViewById(R.id.back_button)

        return view
    }

    override fun onStart() {
        super.onStart()


        tooSweet.apply {
            setOnCheckedChangeListener {_, isChecked ->
                fruit.tooSweet = isChecked
                //TODO update target, new frequency +10 is new low value
            }
        }

        tooBitter.apply {
            setOnCheckedChangeListener {_, isChecked ->
                fruit.tooBitter = isChecked
                //TODO update target, new frequency -10 is new high value
            }
        }

        tooSoft.apply {
            setOnCheckedChangeListener {_, isChecked ->
                fruit.tooSoft = isChecked
                //TODO update target, new frequency +10 is new low
            }
        }

        tooCrunchy.apply {
            setOnCheckedChangeListener {_, isChecked ->
                fruit.tooCrunchy = isChecked
                //TODO update target, new frequency -10 is new high
            }
        }

        backButton.setOnClickListener{
            val fragment = FruitFragment.newInstance()
            val fm = activity?.supportFragmentManager
            if (fm != null) {
                fm.beginTransaction()
                    .replace(R.id.fragment_container, fragment)
                    .commit()
            }
        }
    }

    companion object {
        fun newInstance(): ReviewFragment {
            return ReviewFragment()
        }
    }
}