package com.example.readcgmdata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnReadCgm: Button = findViewById(R.id.btn_readCgm)
        btnReadCgm.setOnClickListener {
            Toast.makeText(this, "Button clicked!", Toast.LENGTH_SHORT).show()

            //TO DO - Add functionality to read CGM Data using Gleb's library and display here
        }
    }
}