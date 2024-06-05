package com.example.ngopii

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.google.android.ads.mediationtestsuite.viewmodels.ItemViewHolder

class Daftar_Menu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daftar_menu)

        val bar = supportActionBar
        bar!!.title = "Wisata Jawa Timur"
        bar.setDisplayHomeAsUpEnabled(true)

        var listView = findViewById<ListView>(R.id.listview)
        var list = mutableListOf<List_Menu>()

        list.add(List_Menu("Gunung Bromo", "Lokasi: Malang", R.drawable.bromo, 4.0))
        list.add(List_Menu("Pantai Klayar", "Lokasi: Pacitan", R.drawable.pantai_klayar, 3.5))
        list.add(List_Menu("Kawah Ijen", "Lokasi: Banyuwangi", R.drawable.kawahijen, 4.0))
        list.add(List_Menu("Tumpak Sewu", "Lokasi: Lumajang", R.drawable.tumpaksewu, 4.5))
        list.add(List_Menu("Jatim Park 1", "Lokasi: Batu", R.drawable.jatimpark, 5.0))

        //listView.adapter = List_MenuAdapter(this, R.layout.activity_listview, list)


        listView.setOnItemClickListener { adapterView, view, i, l ->
            when (i) {
                0 -> {
                    val inten = Intent( this,Bromo::class.java)
                    startActivity(inten)
                }
                1 -> {
                    val inten = Intent( this,PantaiKlayar::class.java)
                    startActivity(inten)
                }
                2 -> {
                    val inten = Intent( this,KawahIjen::class.java)
                    startActivity(inten)
                }
                3 -> {
                    val inten = Intent( this,TumpakSewu::class.java)
                    startActivity(inten)
                }
                4 -> {
                    val inten = Intent( this,JatimPark::class.java)
                    startActivity(inten)
                }

            }
        }
    }
}