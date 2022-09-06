package com.cowok.hijrah.chapter3topic4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_dua.*

class FragmentDua : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dua, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        buttonSimpan2.setOnClickListener {
            var dataUmur = editTextFragmentDua.text.toString()
            var bund = Bundle()
            bund.putString("umur", dataUmur)

            Navigation.findNavController(view).navigate(R.id.action_fragmentDua_to_fragmentTiga, bund)
        }
    }
}