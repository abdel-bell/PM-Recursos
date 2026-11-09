package com.abdu.cuadrado

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import model.Cuadrado

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val cuadradoVista : View = findViewById(R.id.cuadrado)

        cuadradoVista.post {
            val botArriba: Button = findViewById<Button>(R.id.botArriba)
            val botAbajo : Button = findViewById<Button>(R.id.botAbajo)
            val botDerecha : Button = findViewById<Button>(R.id.botDerecha)
            val botIzquierda : Button = findViewById<Button>(R.id.botIzquierda)

            val botTamano : Button = findViewById<Button>(R.id.botTamano)
            val botColor: Button = findViewById<Button>(R.id.botColor)


            //relacionamos el objeto con el layout
            //variables iniciales con los valores de la view

            val inicialX = cuadradoVista.x.toInt()
            val inicialY = cuadradoVista.y.toInt()
            val anchoInicial = cuadradoVista.layoutParams.width
            val altoInicial = cuadradoVista.layoutParams.height

            val cuadrado = Cuadrado(ContextCompat.getColor(this,R.color.black), anchoInicial, altoInicial).apply {
                x = inicialX
                y = inicialY

            }
            botArriba.setOnClickListener {
                cuadrado.moverArriba()
                actualizarVista(cuadradoVista,cuadrado)
            }
            botAbajo.setOnClickListener {
                cuadrado.moverAbajo()
                actualizarVista(cuadradoVista,cuadrado)
            }
            botDerecha.setOnClickListener {
                cuadrado.moverDerecha()
                actualizarVista(cuadradoVista,cuadrado)
            }
            botIzquierda.setOnClickListener {
                cuadrado.moverIzquierda()
                actualizarVista(cuadradoVista,cuadrado)
            }
            botTamano.setOnClickListener {
                cuadrado.cambiarTamano(300,300)
                actualizarVista(cuadradoVista,cuadrado)
            }
            botColor.setOnClickListener {
                cuadrado.cambiarColor()
                actualizarVista(cuadradoVista,cuadrado)
            }
        }


    }
    fun actualizarVista (cuadradoVista : View, cuadrado: Cuadrado ){
        cuadradoVista.y = cuadrado.y.toFloat()
        cuadradoVista.x = cuadrado.x.toFloat()
        cuadradoVista.layoutParams.width = cuadrado.ancho
        cuadradoVista.layoutParams.height = cuadrado.alto
        cuadradoVista.setBackgroundColor(cuadrado.color)
        //se ejecutan los cambios
        cuadradoVista.requestLayout()
    }
}