package com.example.ngopii

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Bromo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.`activity_gunungbromo`)

        val bar = supportActionBar
        bar!!.title = "Gunung Bromo"
        bar.setDisplayHomeAsUpEnabled(true)

    }
}