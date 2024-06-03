package com.example.ngopii

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class JatimPark : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.`activity_jatim_park`)

        val bar = supportActionBar
        bar!!.title = "Jatim Park 1"
        bar.setDisplayHomeAsUpEnabled(true)


    }
}