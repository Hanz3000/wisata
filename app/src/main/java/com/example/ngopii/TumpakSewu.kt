package com.example.ngopii

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class TumpakSewu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.`activity_tumpaksewu`)

        val bar = supportActionBar
        bar!!.title = "Air Terjun Tumpak Sewu"
        bar.setDisplayHomeAsUpEnabled(true)


    }
}