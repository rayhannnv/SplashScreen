package com.example.splashscreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.splashscreen.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var  binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        val name = intent.getStringExtra("name")
//        binding.textView.text = name
    }
}