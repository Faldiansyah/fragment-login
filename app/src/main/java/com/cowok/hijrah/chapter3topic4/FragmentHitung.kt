package com.cowok.hijrah.chapter3topic4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_hitung.*
import kotlinx.android.synthetic.main.fragment_home.*

class FragmentHitung : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_hitung, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var getDataLengkap = arguments?.getString("dataLengkap")
        textView11.text = getDataLengkap
        Toast.makeText(context, "Selamat ya, semoga bisa lebih baik lagi", Toast.LENGTH_SHORT).show()
    }

}