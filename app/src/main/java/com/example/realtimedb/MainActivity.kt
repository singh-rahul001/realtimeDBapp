package com.example.realtimedb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val regBtn = findViewById<Button>(R.id.btnReg)

        regBtn.setOnClickListener()
        {
            val intent = Intent(this, CreateProfile::class.java)
            startActivity(intent)
        }
    }
}