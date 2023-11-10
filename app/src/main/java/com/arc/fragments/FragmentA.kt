package com.arc.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment

class FragmentA : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_a, container, false)

        val btnNext = view.findViewById<Button>(R.id.btnNext)
        btnNext.setOnClickListener {
            val data = view.findViewById<EditText>(R.id.editTextData).text.toString()

            val fragmentB = FragmentB()
            val bundle = Bundle()
            bundle.putString("data", data)
            fragmentB.arguments = bundle

            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.container, fragmentB)
                .addToBackStack(null)
                .commit()
        }

        return view
    }
}

