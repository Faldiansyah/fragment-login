package com.cowok.hijrah.chapter3topic4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_home.*

class FragmentHome : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var getUser = arguments?.getString("user")
        textView10.text = "Halo, "+ getUser
        Toast.makeText(context, "Selamat datang $getUser", Toast.LENGTH_SHORT).show()

        buttonHitungUmur.setOnClickListener {
            var dataTahunLahir = editTextUmurHome.text.toString().toInt()
            var dataTahunSekarang = 2022
            var umur = (dataTahunSekarang - dataTahunLahir).toString()
            var dataProfile = textView10.text.toString()
            var dataLengkap = "$dataProfile. Umur kamu sekarang sudah $umur tahun"
            var bundLengkap = Bundle()
            bundLengkap.putString("dataLengkap", dataLengkap)

            Navigation.findNavController(view).navigate(R.id.action_fragmentHome_to_fragmentHitung, bundLengkap)
        }

        imageViewHome.setOnClickListener {
            var getUser = arguments?.getString("user")
            var bundProfile = Bundle()
            bundProfile.putString("profile", getUser)

            Navigation.findNavController(view).navigate(R.id.action_fragmentHome_to_fragmentProfile, bundProfile)
        }
    }

}