package com.geco.rambulalulintas.aturan

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import com.geco.rambulalulintas.MainActivity
import com.geco.rambulalulintas.databinding.FragmentAturanBerkendaraBinding
import com.google.android.material.dialog.MaterialAlertDialogBuilder


class AturanBerkendaraFragment : Fragment() {
    private var _binding: FragmentAturanBerkendaraBinding? = null
    private val binding get() = _binding!!
    private lateinit var selectedpasal: String
    private var selectedpasalIndex: Int = 0
    private val pasal = arrayOf("Pasal 276", "Pasal 277", "Pasal 278", "Pasal 279", "Pasal 280",
        "Pasal 281", "Pasal 282", "Pasal 283", "Pasal 284", "Pasal 285 ayat 1", "Pasal 285 ayat 2", "Pasal 286")


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentAturanBerkendaraBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnPilihPasal.setOnClickListener {
            showRadioConfirmationDialog()
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


    private fun showRadioConfirmationDialog() {
        selectedpasal = pasal[selectedpasalIndex]
        MaterialAlertDialogBuilder(requireContext())
            .setTitle("Daftar Pasal")
            .setSingleChoiceItems(pasal, selectedpasalIndex) { dialog_, which ->
                selectedpasalIndex = which
                selectedpasal = pasal[which]
            }
            .setPositiveButton("Ok") { dialog, which ->
                binding.tvNamaPasal.text = selectedpasal
                binding.btnPilihPasal.text = selectedpasal
                if (selectedpasal == "Pasal 276"){
                    binding.tvIsiPasal.text = "Setiap orang yang mengemudikan Kendaraan Bermotor Umum dalam trayek tidak singgah di Terminal sebagaimana dimaksud dalam Pasal 36 dipidana dengan pidana kurungan paling lama 1 (satu) bulan atau denda paling banyak Rp250.000,00 (dua ratus lima puluh ribu rupiah)."
                } else if (selectedpasal == "Pasal 277"){
                    binding.tvIsiPasal.text = "Setiap orang yang memasukkan Kendaraan Bermotor, kereta gandengan, dan kereta tempelan ke dalam wilayah Republik Indonesia, membuat, merakit, atau memodifikasi Kendaraan Bermotor yang menyebabkan perubahan tipe, kereta gandengan, kereta tempelan, dan kendaraan khusus yang dioperasikan di dalam negeri yang tidak memenuhi kewajiban uji tipe sebagaimana dimaksud dalam Pasal 50 ayat (1) dipidana dengan pidana penjara paling lama 1 (satu) tahun atau denda paling banyak Rp24.000.000,00 (dua puluh empat juta rupiah)."
                }else if (selectedpasal == "Pasal 278"){
                    binding.tvIsiPasal.text = "Setiap orang yang mengemudikan Kendaraan Bermotor beroda empat atau lebih di Jalan yang tidak dilengkapi dengan perlengkapan berupa ban cadangan, segitiga pengaman, dongkrak, pembuka roda, dan peralatan pertolongan pertama pada kecelakaan sebagaimana dimaksud dalam Pasal 57 ayat (3) dipidana dengan pidana kurungan paling lama 1 (satu) bulan atau denda paling paling banyak Rp250.000,00 (dua ratus lima puluh ribu rupiah)."
                }else if (selectedpasal == "Pasal 279"){
                    binding.tvIsiPasal.text = "Setiap orang yang mengemudikan Kendaraan Bermotor di Jalan yang dipasangi perlengkapan yang dapat mengganggu keselamatan berlalu lintas sebagaimana dimaksud dalam Pasal 58 dipidana dengan pidana kurungan paling lama 2 (dua) bulan atau denda paling banyak Rp500.000,00 (lima ratus ribu rupiah)."
                }else if (selectedpasal == "Pasal 280"){
                    binding.tvIsiPasal.text = "Setiap orang yang mengemudikan Kendaraan Bermotor di Jalan yang tidak dipasangi Tanda Nomor Kendaraan Bermotor yang ditetapkan oleh Kepolisian Negara Republik Indonesia sebagaimana dimaksud dalam Pasal 68 ayat (1) dipidana dengan pidana kurungan paling lama 2 (dua) bulan atau denda paling banyak Rp500.000,00 (lima ratus ribu rupiah)."
                }else if (selectedpasal == "Pasal 281"){
                    binding.tvIsiPasal.text = "Setiap orang yang mengemudikan Kendaraan Bermotor di Jalan yang tidak memiliki Surat Izin Mengemudi sebagaimana dimaksud dalam Pasal 77 ayat (1) dipidana dengan pidana kurungan paling lama 4 (empat) bulan atau denda paling banyak Rp1.000.000,00 (satu juta rupiah)."
                }else if (selectedpasal == "Pasal 282"){
                    binding.tvIsiPasal.text = "Setiap Pengguna Jalan yang tidak mematuhi perintah yang diberikan oleh petugas Kepolisian Negara Republik Indonesia sebagaimana dimaksud dalam Pasal 104 ayat (3) dipidana dengan pidana kurungan paling lama 1 (satu) bulan atau denda paling banyak Rp250.000,00 (dua ratus lima puluh ribu rupiah)."
                }else if (selectedpasal == "Pasal 283"){
                    binding.tvIsiPasal.text = "Setiap orang yang mengemudikan Kendaraan Bermotor di Jalan secara tidak wajar dan melakukan kegiatan lain atau dipengaruhi oleh suatu keadaan yang mengakibatkan gangguan konsentrasi dalam mengemudi di Jalan sebagaimana dimaksud dalam Pasal 106 ayat (1) dipidana dengan pidana kurungan paling lama 3 (tiga) bulan atau denda paling banyak Rp750.000,00 (tujuh ratus lima puluh ribu rupiah)."
                }else if (selectedpasal == "Pasal 284"){
                    binding.tvIsiPasal.text = "Setiap orang yang mengemudikan Kendaraan Bermotor dengan tidak mengutamakan keselamatan Pejalan Kaki atau pesepeda sebagaimana dimaksud dalam Pasal 106 ayat (2) dipidana dengan pidana kurungan paling lama 2 (dua) bulan atau denda paling banyak Rp500.000,00 (lima ratus ribu rupiah)."
                }else if (selectedpasal == "Pasal 285 ayat 1"){
                    binding.tvIsiPasal.text = "(1) Setiap orang yang mengemudikan Sepeda Motor di Jalan yang tidak memenuhi persyaratan teknis dan laik jalan yang meliputi kaca spion, klakson, lampu utama, lampu rem, lampu penunjuk arah, alat pemantul cahaya, alat pengukur kecepatan, knalpot, dan kedalaman alur ban sebagaimana dimaksud dalam Pasal 106 ayat (3) juncto Pasal 48 ayat (2) dan ayat (3) dipidana dengan pidana kurungan paling lama 1 (satu) bulan atau denda paling banyak Rp250.000,00 (dua ratus lima puluh ribu rupiah)."
                }else if (selectedpasal == "Pasal 285 ayat 2"){
                    binding.tvIsiPasal.text = "(2) Setiap orang yang mengemudikan Kendaraan Bermotor beroda empat atau lebih di Jalan yang tidak memenuhi persyaratan teknis yang meliputi kaca spion, klakson, lampu utama, lampu mundur, lampu tanda batas dimensi badan kendaraan, lampu gandengan, lampu rem, lampu penunjuk arah, alat pemantul cahaya, alat pengukur kecepatan, kedalaman alur ban, kaca depan, spakbor, bumper, penggandengan, penempelan, atau penghapus kaca sebagaimana dimaksud dalam Pasal 106 ayat (3) juncto Pasal 48 ayat (2) dipidana dengan pidana kurungan paling lama 2 (dua) bulan atau denda paling banyak Rp500.000,00 (lima ratus ribu rupiah)."
                }else if (selectedpasal == "Pasal 286"){
                    binding.tvIsiPasal.text = "Setiap orang yang mengemudikan Kendaraan Bermotor beroda empat atau lebih di Jalan yang tidak memenuhi persyaratan laik jalan sebagaimana dimaksud dalam Pasal 106 ayat (3) juncto Pasal 48 ayat (3) dipidana dengan pidana kurungan paling lama 2 (dua) bulan atau denda paling banyak Rp500.000,00 (lima ratus ribu rupiah)."
                }
            }
            .setNegativeButton("Cancel") { dialog, which ->
                dialog.dismiss()
            }
            .show()
    }
}