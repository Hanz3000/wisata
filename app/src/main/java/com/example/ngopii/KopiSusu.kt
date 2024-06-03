package com.example.ngopii

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class KopiSusu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kopi_susu)

        val bar = supportActionBar
        bar!!.title = "Gunung Bromo"
        bar.setDisplayHomeAsUpEnabled(true)

    }
}