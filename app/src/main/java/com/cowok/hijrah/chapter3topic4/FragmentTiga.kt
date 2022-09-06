package com.cowok.hijrah.chapter3topic4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_tiga.*

class FragmentTiga : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tiga, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        buttonMain.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_fragmentTiga_to_fragmentSatu)
        }

        var getUmur = arguments?.getString("umur")
        textViewGetUmur.text = getUmur + " tahun"

        Toast.makeText(context, "Umur anda $getUmur tahun", Toast.LENGTH_SHORT).show()

    }
}