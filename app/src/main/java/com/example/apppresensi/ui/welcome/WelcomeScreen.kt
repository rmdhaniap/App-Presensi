package com.example.apppresensi.ui.welcome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.apppresensi.R
import com.example.apppresensi.databinding.ActivityWelcomeScreenBinding
import com.example.apppresensi.ui.landing.LandingScreen

class WelcomeScreen : AppCompatActivity() {

    private lateinit var binding: ActivityWelcomeScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWelcomeScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        binding.btnLanjut.setOnClickListener {
            intent = Intent(this@WelcomeScreen, LandingScreen::class.java)
            startActivity(intent)
            finish()
        }
    }
}