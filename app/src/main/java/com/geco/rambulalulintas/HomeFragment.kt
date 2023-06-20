package com.geco.rambulalulintas

import android.R
import android.content.Intent
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import com.geco.rambulalulintas.aturan.AturanActivity
import com.geco.rambulalulintas.databinding.FragmentHomeBinding
import com.geco.rambulalulintas.profil.ProfilActivity
import com.geco.rambulalulintas.rambu.RambuActivity
import com.geco.rambulalulintas.ujian.UjianActivity


class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!
    private var loinStat: Boolean = false

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loginCheck(loinStat)
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
                    .setCancelable(false)
                    .setPositiveButton(android.R.string.ok) { dialog, whichButton ->
                        activity?.onBackPressed()
                    }
                    .setNegativeButton(android.R.string.cancel) { dialog, whichButton ->
                    }

                    .show()
                isEnabled = false
                loinStat = true
//                activity?.onBackPressed()
            }
        })
    }

    private fun loginCheck(loginStatus : Boolean){
        if (loginStatus){
            showPopUp()
            loinStat = false
        }
    }
    private fun showPopUp(){
        // instance of alert dialog to build alert dialog
        // instance of alert dialog to build alert dialog
        val builder = AlertDialog.Builder(requireContext())
            .setTitle("Panduan")
            .setMessage("Menu Panduan ada di bawah")
            .setCancelable(false)
            .setNeutralButton(
            "Oke"
        ) { dialog, which ->
        }
        val alertDialog = builder.create()
        alertDialog.show()
        alertDialog.window!!.setGravity(Gravity.BOTTOM)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        loinStat = true
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