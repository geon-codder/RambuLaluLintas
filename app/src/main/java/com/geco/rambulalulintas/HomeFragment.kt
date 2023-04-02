package com.geco.rambulalulintas

import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.AlertDialog
import com.geco.rambulalulintas.aturan.AturanActivity
import com.geco.rambulalulintas.databinding.FragmentHomeBinding
import com.geco.rambulalulintas.profil.ProfilActivity
import com.geco.rambulalulintas.rambu.RambuActivity
import com.geco.rambulalulintas.ujian.UjianActivity
import com.geco.rambulalulintas.ujian.UjianSIMFragment


class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.btnProfil.setOnClickListener {
            requireActivity().run{
                startActivity(Intent(this, ProfilActivity::class.java))
                finish()
            }
        }
        binding.btnAturan.setOnClickListener {
            requireActivity().run{
                startActivity(Intent(this, AturanActivity::class.java))
                finish()
            }
        }
        binding.btnRambu.setOnClickListener {
            requireActivity().run{
                startActivity(Intent(this, RambuActivity::class.java))
                finish()
            }
        }
        binding.btnUjianSim.setOnClickListener {
            requireActivity().run{
                startActivity(Intent(this, UjianActivity::class.java))
                finish()
            }
        }
        activity?.onBackPressedDispatcher?.addCallback(viewLifecycleOwner, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                // in here you can do logic when backPress is clicked
                AlertDialog.Builder(requireContext())
                    .setTitle("Exit Alert")
                    .setMessage("Do You Want To Exit App?")
                    .setPositiveButton(android.R.string.ok) { dialog, whichButton ->
                        activity?.onBackPressed()
                    }
                    .setNegativeButton(android.R.string.cancel) { dialog, whichButton ->

                    }
                    .show()
                isEnabled = false
//                activity?.onBackPressed()
            }
        })
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        fun newInstance(): HomeFragment{
            val fragment = HomeFragment()
            val args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }
}