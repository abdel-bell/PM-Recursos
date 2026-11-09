package com.abdu.cuadrado

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val botArriba: Button = findViewById<Button>(R.id.botArriba)
        val botAbajo : Button = findViewById<Button>(R.id.botAbajo)
        val botDerecha : Button = findViewById<Button>(R.id.botDerecha)
        val botIzquierda : Button = findViewById<Button>(R.id.botIzquierda)

        val botTamano : Button = findViewById<Button>(R.id.botTamano)
        val botColor: Button = findViewById<Button>(R.id.botColor)

        val cuadrado : View = findViewById(R.id.cuadrado)




    }
}