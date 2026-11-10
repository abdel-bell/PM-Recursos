package model

import android.graphics.Color
import androidx.core.content.ContextCompat
import com.abdu.cuadrado.R
import java.util.random.RandomGenerator
import kotlin.random.Random

class Cuadrado(var color: Int, var ancho: Int, var alto: Int) {
    //coordenadas
    var x : Int = 0
    var y : Int = 0

    //métodos

    fun moverArriba(){

        y -= 10

    }

    fun moverAbajo(){

        y += 10

    }

    fun moverDerecha(){

        x += 10

    }

    fun moverIzquierda(){

        x -= 10

    }

    fun cambiarTamano(nuevoAncho: Int, nuevoAlto: Int){

        ancho =nuevoAncho
        alto = nuevoAlto
    }


}