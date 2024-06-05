package com.example.ngopii

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Daftar_Menu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daftar_menu)

        val bar = supportActionBar
        bar!!.title = "Wisata Jawa Timur"
        bar.setDisplayHomeAsUpEnabled(true)

        val recyclerView = findViewById<RecyclerView>(R.id.listview) // Perubahan disini
        val list = mutableListOf<List_Menu>()

        list.add(List_Menu("Gunung Bromo", "Lokasi: Malang", R.drawable.bromo, 4.0))
        list.add(List_Menu("Pantai Klayar", "Lokasi: Pacitan", R.drawable.pantai_klayar, 3.5))
        list.add(List_Menu("Kawah Ijen", "Lokasi: Banyuwangi", R.drawable.kawahijen, 4.0))
        list.add(List_Menu("Tumpak Sewu", "Lokasi: Lumajang", R.drawable.tumpaksewu, 4.5))
        list.add(List_Menu("Jatim Park 1", "Lokasi: Batu", R.drawable.jatimpark, 5.0))

        val adapter = List_MenuAdapter(list)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)

        adapter.setOnItemClickListener(object : OnItemClickListener {
            override fun onItemClick(position: Int) {
                val intent = when (position) {
                    0 -> Intent(this@Daftar_Menu, Bromo::class.java)
                    1 -> Intent(this@Daftar_Menu, PantaiKlayar::class.java)
                    2 -> Intent(this@Daftar_Menu, KawahIjen::class.java)
                    3 -> Intent(this@Daftar_Menu, TumpakSewu::class.java)
                    4 -> Intent(this@Daftar_Menu, JatimPark::class.java)
                    else -> throw IllegalArgumentException("Invalid position")
                }
                startActivity(intent)
            }
        })
    }

    private fun List_MenuAdapter(items: MutableList<List_Menu>): List_MenuAdapter {

        return TODO("Provide the return value")
    }
}
interface OnItemClickListener {
    fun onItemClick(position: Int)
}

