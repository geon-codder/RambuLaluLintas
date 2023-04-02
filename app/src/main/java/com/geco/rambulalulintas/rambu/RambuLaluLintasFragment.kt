package com.geco.rambulalulintas.rambu

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.geco.rambulalulintas.MainActivity
import com.geco.rambulalulintas.R
import com.geco.rambulalulintas.databinding.FragmentPanduanBinding
import com.geco.rambulalulintas.databinding.FragmentRambuLaluLintasBinding
import com.geco.rambulalulintas.profil.ProfilActivity


class RambuLaluLintasFragment : Fragment() {
    private var _binding: FragmentRambuLaluLintasBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentRambuLaluLintasBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnLarangan.setOnClickListener {
            findNavController().navigate(R.id.action_rambuLaluLintasFragment_to_rambuLaranganFragment)
        }
        binding.btnPeringatan.setOnClickListener {
            findNavController().navigate(R.id.action_rambuLaluLintasFragment_to_rambuPeringatanFragment)
        }
        binding.btnPerintah.setOnClickListener {
            findNavController().navigate(R.id.action_rambuLaluLintasFragment_to_rambuPerintahFragment)
        }
        binding.btnPetunjuk.setOnClickListener {
            findNavController().navigate(R.id.action_rambuLaluLintasFragment_to_rambuPetunjukFragment)
        }
        activity?.onBackPressedDispatcher?.addCallback(viewLifecycleOwner, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                // in here you can do logic when backPress is clicked
                requireActivity().run{
                    startActivity(Intent(this, MainActivity::class.java))
                    finish()
                }
                isEnabled = false
                activity?.onBackPressed()
            }
        })
    }
}