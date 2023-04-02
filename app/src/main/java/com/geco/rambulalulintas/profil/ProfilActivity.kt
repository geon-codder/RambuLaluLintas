package com.geco.rambulalulintas.profil

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.AppCompatActivity
import com.geco.rambulalulintas.MainActivity
import com.geco.rambulalulintas.databinding.ActivityProfilBinding

class ProfilActivity : AppCompatActivity() {

    private lateinit var binding: ActivityProfilBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfilBinding.inflate(layoutInflater)
        setContentView(binding.root)

        onBackPressedDispatcher.addCallback(this,onBackInvokedCallback)
        binding.apply{
            ivWa.setOnClickListener {
                tvWa.visibility = View.VISIBLE
                startActivity(
                    Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse(
                            "https://api.whatsapp.com/send?phone=+6285242020271&text=Hai, saya ingin bertanya mengenai aplikasi rambu lalu lintas"
                        )
                    )
                )
            }
            ivInsta.setOnClickListener {
                tvInstagram.visibility = View.VISIBLE
                val uri = Uri.parse("http://instagram.com/_u/mhmmdfdhilwhydi")
                val instagram = Intent(Intent.ACTION_VIEW, uri)
                instagram.setPackage("com.instagram.android")
                try{
                    startActivity(instagram)
                } catch (e: ActivityNotFoundException) {
                    startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("http://instagram.com/_u/mhmmdfdhilwhydi")))
                }
            }
            ivGmail.setOnClickListener {
                tvGmail.visibility = View.VISIBLE
            }
        }

    }

//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        return when(item.itemId){
//            android.R.id.home ->{
//                startActivity(Intent(this, MainActivity::class.java))
//                true
//            }
//            else -> super.onOptionsItemSelected(item)
//        }
//    }

//    @Deprecated("Deprecated in Java")
//    override fun onBackPressed(){
//        super.onBackPressed()
//    }

    private val onBackInvokedCallback = object : OnBackPressedCallback(true){
        override fun handleOnBackPressed(){
            val intent = Intent(this@ProfilActivity, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}