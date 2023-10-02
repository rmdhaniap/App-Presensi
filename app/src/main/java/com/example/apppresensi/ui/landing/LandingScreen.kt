package com.example.apppresensi.ui.landing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.apppresensi.R
import com.example.apppresensi.databinding.ActivityLandingScreenBinding
import com.example.apppresensi.ui.login.LoginActivity
import com.example.apppresensi.ui.register.RegisterActivity

class LandingScreen : AppCompatActivity() {

    private lateinit var binding: ActivityLandingScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLandingScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        binding.login.setOnClickListener {
            val intentLogin = Intent(this@LandingScreen, LoginActivity::class.java)
            startActivity(intentLogin)
        }

        binding.register.setOnClickListener {
            val intentRegister = Intent(this@LandingScreen, RegisterActivity::class.java)
            startActivity(intentRegister)
        }
    }
}