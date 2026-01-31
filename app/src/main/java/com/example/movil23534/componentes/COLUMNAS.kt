package com.example.movil23534.componentes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.movil23534.Mytxt

//@Preview (showBackground = true)
@Composable
fun Columnas (){
    Column(verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize().background(Color.Black).padding(end = 180.dp),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "Hola")
        Spacer(modifier = Modifier.height(height = 20.dp))
        Text(text = "Gracias")
        Spacer(modifier = Modifier.height(height = 20.dp))
        Text(text = "Adios")
        Mytxt()
    }

}
@Preview (showBackground = true)
@Composable
fun Separadores(){
    Column(verticalArrangement = Arrangement.Center,
    modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
        ) {
        Text("Mexico",modifier = Modifier.fillMaxSize().weight(0.25f))
        HorizontalDivider(thickness = 10.dp, color = Color.Green)
        Text("Lindo",modifier = Modifier.fillMaxSize().weight(0.50f))
        //Text("Y")
        Text("Querido",modifier = Modifier.fillMaxSize().weight(0.25f))
        Columnas()
    }
}
