package com.example.ngopii

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class KawahIjen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.`activity_kawahijen`)

        val bar = supportActionBar
        bar!!.title = "Kawah Ijen"
        bar.setDisplayHomeAsUpEnabled(true)



    }
}