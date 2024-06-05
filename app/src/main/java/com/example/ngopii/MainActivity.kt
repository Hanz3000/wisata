package com.example.ngopii

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView
import com.example.ngopii.databinding.ActivityGunungbromoBinding


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityGunungbromoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // inisialisasi variable objek view dengan file kotlin (prosesor)
        val tombol_order = findViewById<Button>(R.id.tombol_order)
        val text_satu = findViewById<TextView>(R.id.text_satu)

        // ini adalah fungsi event klik tombol
        tombol_order.setOnClickListener {
            // intent digunakan untuk memanggil / menampilkan activity baru
            val inten = Intent( this,Login::class.java)
            startActivity(inten)
        }
        binding.imageView4

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_pertama,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId

        when(id){ // ini switch case jika di php
            R.id.menu_satu -> {
                // blok program satu yang akan dieksekusi
                val inten = Intent( this, Login::class.java)
                startActivity(inten)
            }
            R.id.menu_empat -> {
                // blok program satu yang akan dieksekusi
                val inten = Intent( this, AboutUs::class.java)
                startActivity(inten)
            }


        }

        return super.onOptionsItemSelected(item)
    }

}