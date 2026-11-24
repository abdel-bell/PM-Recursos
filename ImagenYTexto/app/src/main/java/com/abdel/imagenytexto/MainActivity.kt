package com.abdel.imagenytexto

import android.icu.text.RelativeDateTimeFormatter
import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fitInside
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.overscroll
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathSegment
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.app.NotificationCompat
import com.abdel.imagenytexto.ui.theme.ImagenYTextoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

        }
    }
}

@Composable
fun Prueba() {

    Box(modifier = Modifier.fillMaxSize().padding(20.dp)) {


        Image(
            painter = painterResource(id = R.drawable.imagen),
            contentDescription = "imagen de pizarra",
            modifier = Modifier.align(Alignment.Center).fillMaxSize()
        )
        Text("Hola Señores", modifier = Modifier.align(Alignment.Center),
            color = Color.Red, fontSize = 23.sp,
            fontStyle = FontStyle.Italic,
            
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PruebaPreview() {
    Prueba()
}