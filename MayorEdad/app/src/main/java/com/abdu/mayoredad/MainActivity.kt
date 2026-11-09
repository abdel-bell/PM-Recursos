package com.abdu.mayoredad

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val escribirEdad: EditText = findViewById(R.id.escribirEdad)
        val botCalcular: Button = findViewById(R.id.button)
        val decirEdad: TextView = findViewById(R.id.decirEdad)
        val botMas: Button = findViewById<Button>(R.id.plusButton)
        val botMenos: Button = findViewById<Button>(R.id.lessButton)

        escribirEdad.setText("0").toString().toIntOrNull()

        botCalcular.setOnClickListener {
            val edad = escribirEdad.text.toString().toIntOrNull()

            ponerTexto(edad,decirEdad)

        }

        botMas.setOnClickListener {
            var edad: Int? = escribirEdad.text.toString().toIntOrNull()
            if (edad != null) {
                escribirEdad.text.clear()

                ++ edad

                escribirEdad.setText("$edad")

            }
            else if (edad == null){
                escribirEdad.setText("0")
            }
            ponerTexto(edad,decirEdad)
        }
        botMenos.setOnClickListener {
            var edad: Int? = escribirEdad.text.toString().toIntOrNull()
            if (edad != null) {
                escribirEdad.text.clear()
                if (edad>=1) {
                    --edad

                    escribirEdad.setText("$edad")
                }

                ponerTexto(edad,decirEdad)
            }
        }



    }

    fun ponerTexto(edad: Int?, decirEdad: TextView){

        if (edad != null) {

            if (edad > 18) {

                decirEdad.text = "Eres mayor de edad"
            } else if (edad == 18){
                decirEdad.text= "Acabas de cumplir la mayoria de edad"
            } else if (edad < 18){
                decirEdad.text= "Eres menor de edad"
            }
        } else {
            decirEdad.text = "Rellena el campo con tu edad"
        }

    }
}
