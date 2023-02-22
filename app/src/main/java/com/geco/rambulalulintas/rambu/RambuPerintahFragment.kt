package com.geco.rambulalulintas.rambu

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.geco.rambulalulintas.R
import com.geco.rambulalulintas.databinding.FragmentRambuPeringatanBinding
import com.geco.rambulalulintas.databinding.FragmentRambuPerintahBinding


class RambuPerintahFragment : Fragment() {
    private var _binding: FragmentRambuPerintahBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentRambuPerintahBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}