package com.cowok.hijrah.chapter3topic4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_login.*

class FragmentLogin : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        buttonLogin.setOnClickListener {
            var dataUser = editTextUsername.text.toString()
            var dataPass = editTextPassword.text.toString()

            if (dataUser == "Faldiansyah" && dataPass == "12345") {
                var bundUser = Bundle()
                bundUser.putString("user", dataUser)

                Navigation.findNavController(view).navigate(R.id.action_fragmentLogin_to_fragmentHome, bundUser)
            } else if (dataUser == "" && dataPass == "") {
                Toast.makeText(context, "Username dan Password harus di isi terlebih dahulu !!!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(context, "Username atau Password Anda salah !!!", Toast.LENGTH_SHORT).show()
            }

        }

        textViewRegister.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_fragmentLogin_to_fragmentRegister)
        }

        imageViewHelp.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_fragmentLogin_to_fragmentHelp)
        }

        imageViewChats.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_fragmentLogin_to_fragmentChats)
        }

        textViewLupaPassword.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_fragmentLogin_to_fragmentLupaPassword)
        }
    }

}