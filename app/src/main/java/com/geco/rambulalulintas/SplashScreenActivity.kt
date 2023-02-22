package com.geco.rambulalulintas

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

@SuppressLint("CustomSplashScreen")
class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val homeIntent = Intent(this@SplashScreenActivity, MainActivity::class.java)
        Handler(Looper.getMainLooper()).postDelayed({
            //Do some stuff here, like implement deep linking
            startActivity(homeIntent)
            finish()
        }, SPLASH_TIME_OUT.toLong())
    }

    companion object {
        const val SPLASH_TIME_OUT = 3000
    }

}