package com.geco.rambulalulintas.ujian

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.OnBackPressedCallback
import com.geco.rambulalulintas.MainActivity
import com.geco.rambulalulintas.R
import com.geco.rambulalulintas.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {

    private lateinit var binding: ActivityResultBinding

    var totalScore = 0
    var correct = 0
    var wrong = 0
    var skip = 0
    var isKey = false

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        onBackPressedDispatcher.addCallback(this,onBackInvokedCallback)
        totalScore = intent.extras!!.getInt("correct")
        wrong = intent.extras!!.getInt("wrong")
        skip = intent.extras!!.getInt("skip")
        initializeViews()
    }
    @SuppressLint("SetTextI18n")
    private fun initializeViews() {
        binding.apply {
            tvScore.text = "Score: $totalScore"
            tvright.text = "Correct: $correct"
            tvwrong.text = "Wrong: $wrong"
            tvSkip.text = "Skip: $skip"
            if (totalScore >= 6) {
                binding.emojiReactionImg.setImageResource(R.drawable.emo_correct)
                Toast.makeText(this@ResultActivity, "Wow Great", Toast.LENGTH_SHORT).show()
            } else {
                emojiReactionImg.setImageResource(R.drawable.emg_wrong)
                Toast.makeText(this@ResultActivity, "Need Improvement", Toast.LENGTH_SHORT).show()
            }
            btnPlayAgain.setOnClickListener {
                val intent = Intent(this@ResultActivity, UjianActivity::class.java)
                startActivity(intent)
                finish()
            }
            btnReturnHome.setOnClickListener {
                val intent = Intent(this@ResultActivity, MainActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
    }

    override fun onBackPressed(){
        super.onBackPressed()
    }

    private val onBackInvokedCallback = object : OnBackPressedCallback(true){
        override fun handleOnBackPressed(){
            Log.d("onBack", "Exit to Home")
        }
    }
}