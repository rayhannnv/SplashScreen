package com.example.splashscreen.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.provider.Telephony.Mms.Intents
import android.widget.Button
import com.example.splashscreen.MainActivity
import com.example.splashscreen.R
import com.example.splashscreen.databinding.ActivitySplashBinding


class SplashActivity : AppCompatActivity() {

    private lateinit var binding : ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setContentView(R.layout.activity_splash)

        val button = findViewById<Button>(R.id.button1)

        binding.button1.setOnClickListener{
            val data = binding.etName.text.toString()
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("name", "data")
            startActivity(intent)
        }

        binding.btnImplicit.setOnClickListener {
            val sendIntent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, "This Is my text to send")
                type = "text/plain"
            }
        }

//        Handler(Looper.getMainLooper()).postDelayed({
//            startActivity(Intent(this, MainActivity::class.java))
//            finish()
//        }, 3000)
    }
}