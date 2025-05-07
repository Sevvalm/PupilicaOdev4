package com.example.pupilicaodev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.navigation.NavOptions
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.pupilicaodev4.databinding.FragmentSayfaYBinding


class SayfaYFragment : Fragment() {
    private lateinit var binding : FragmentSayfaYBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSayfaYBinding.inflate(inflater, container, false)

        //geri tusuna basildiginda anasayfaya gidecek kodu yaz
        val geriTusu = object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
               findNavController().navigate(
                   R.id.anasayfaFragment,
                   null,
                   NavOptions.Builder()
                       .setPopUpTo(R.id.anasayfaFragment, true)
                       .build()
               )
            }
        }
        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner, geriTusu)


        return binding.root
    }


}