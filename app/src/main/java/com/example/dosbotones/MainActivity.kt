package com.example.dosbotones

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        graciasBoton.setOnClickListener { graciasListe() }
        estornudaBoton.setOnClickListener {
            Toast.makeText(this, "Salud!", Toast.LENGTH_SHORT).show()
        }
    }

    private fun graciasListe(){
        Toast.makeText(this, "De nada", Toast.LENGTH_SHORT).show()
    }
}