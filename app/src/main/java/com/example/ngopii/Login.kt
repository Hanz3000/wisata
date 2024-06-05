package com.example.ngopii

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val bar = supportActionBar
        bar!!.title = "Aplikasi Wisata Kewww Kewww"
        bar.setDisplayHomeAsUpEnabled(true)

        val username = findViewById<EditText>(R.id.username)
        val password = findViewById<EditText>(R.id.password)
        val button_login = findViewById<Button>(R.id.button_login)

        // Tentukan username dan password yang diinginkan
        val desiredUsername = "kelompok8"
        val desiredPassword = "12345"

        button_login.setOnClickListener {
            val inputUsername = username.text.toString()
            val inputPassword = password.text.toString()

            // Periksa apakah username dan password sesuai dengan yang diinginkan
            if (inputUsername == desiredUsername && inputPassword == desiredPassword) {
                // intent digunakan untuk memanggil / menampilkan activity baru
                val intent = Intent(this, Daftar_Menu::class.java)
                startActivity(intent)
                Toast.makeText(this, "Anda berhasil login", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Username atau password salah", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
