package com.example.ngopii

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.ngopii.databinding.ActivityGunungbromoBinding

class GunungBromo : AppCompatActivity() {
    private lateinit var binding: ActivityGunungbromoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_gunungbromo)

        binding.title = "Welcome to Gunung Bromo"

        val bar = supportActionBar
        bar!!.title = "Gunung Bromo"
        bar.setDisplayHomeAsUpEnabled(true)
    }

}
