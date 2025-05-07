package com.example.pupilicaodev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.pupilicaodev4.databinding.FragmentSayfaXBinding


class SayfaXFragment : Fragment() {
    private lateinit var binding : FragmentSayfaXBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentSayfaXBinding.inflate(inflater, container, false)

        binding.buttonXYGit.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.sayfaXtoYGecis)
        }

        return binding.root
    }


}