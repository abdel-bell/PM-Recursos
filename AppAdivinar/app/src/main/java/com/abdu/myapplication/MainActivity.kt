package com.abdu.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val numero1 = Random.nextInt(1,100)

        val escribirNum: EditText = findViewById(R.id.EscribirNumero)
        val enviar: Button = findViewById(R.id.button)
        val texto : TextView = findViewById<TextView>(R.id.adivinanza)

        var intentos : Int = 0
        enviar.setOnClickListener {
            val numero: Int? = escribirNum.text.toString().toIntOrNull()
            ++ intentos
            if (numero != null && numero in 1..100){

                val numero = when{
                    numero < numero1 -> texto.text = "El número es mayor"
                    numero == numero1 -> texto.text = "Acertaste el número. Nº Intentos: $intentos "
                    else ->texto.text = "El número es menor"
                }
            }
            else{
                escribirNum.error = "Introduce un número entre 1 y 100"
                texto.text = "Introduce un valor"
            }


        }
    }
}