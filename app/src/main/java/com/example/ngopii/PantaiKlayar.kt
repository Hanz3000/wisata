package com.example.ngopii

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class PantaiKlayar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.`activity_pantaiklayar`)

        val bar = supportActionBar
        bar!!.title = "Pantai Klayar"
        bar.setDisplayHomeAsUpEnabled(true)


    }
}