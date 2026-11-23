package com.abdel.composeprueba1

import android.R
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.abdel.composeprueba1.ui.theme.ComposePrueba1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Prueba1()
        }
    }
}

@Composable
fun Prueba1(){


    Column(modifier = Modifier.padding(all = 50.dp)) {
        Row() {
            Text(text = "Mas texto  ", Modifier.border(border = BorderStroke(width = 0.6.dp, color = Color.Blue), shape = RectangleShape))
            Spacer(modifier = Modifier.width(40.dp))
            Text(text = "Y mas")
        }
        Text(text = "Hola DAM")
        Text(text = "Me llamo Abdel", color = Color.Blue)

    }
}

@Composable
@Preview

fun Prueba1Preview(){

    Prueba1()

}

