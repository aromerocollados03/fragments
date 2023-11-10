package com.arc.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class FragmentB : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_b, container, false)

        val textViewResult = view.findViewById<TextView>(R.id.textViewResult)

        val bundle = arguments
        if (bundle != null) {
            val data = bundle.getString("data")
            textViewResult.text = data
        }

        return view
    }
}
