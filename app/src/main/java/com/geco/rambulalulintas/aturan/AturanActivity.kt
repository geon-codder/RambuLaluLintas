package com.geco.rambulalulintas.aturan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.geco.rambulalulintas.R
import com.geco.rambulalulintas.databinding.ActivityAturanBinding
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class AturanActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAturanBinding
//    private lateinit var selectedFruits: String
//    private var selectedFruitsIndex: Int = 0
//    private val fruits = arrayOf("Apple", "Banana", "Coconut", "Orange", "Pineapple",
//        "Papaya", "Mango", "Blackberries", "Guava")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAturanBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.apply {
//            btnPilihPasal.setOnClickListener {
//                showRadioConfirmationDialog()
//            }
        }
    }


//    private fun showRadioConfirmationDialog() {
//        selectedFruits = fruits[selectedFruitsIndex]
//        MaterialAlertDialogBuilder(this)
//            .setTitle("List of Fruits")
//            .setSingleChoiceItems(fruits, selectedFruitsIndex) { dialog_, which ->
//                selectedFruitsIndex = which
//                selectedFruits = fruits[which]
//            }
//            .setPositiveButton("Ok") { dialog, which ->
//                Toast.makeText(this, "$selectedFruits Selected", Toast.LENGTH_SHORT)
//                    .show()
//                binding.tvNamaPasal.text = selectedFruits
//                if (selectedFruits == "Apple"){
//                    binding.tvIsiPasal.text = "Apple"
//                } else if (selectedFruits == "Coconut"){
//                    binding.tvIsiPasal.text = "Coconut"
//                }
//            }
//            .setNegativeButton("Cancel") { dialog, which ->
//                dialog.dismiss()
//            }
//            .show()
//    }
}