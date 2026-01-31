package com.example.movil23534.componentes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun Cajas(){
    Box(modifier = Modifier.fillMaxSize()){
        CajaInterna( alineacion = Alignment.TopStart)
        CajaInterna( alineacion = Alignment.BottomEnd)
    }
}
@Composable
fun CajaInterna(alineacion:Alignment){
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = alineacion){
        Box(modifier = Modifier.size(300.dp)){
            Text("A",Modifier.background(color = Color.Red).align(Alignment.TopStart),
                color=Color.White,
                fontSize = 80.sp)
            Text("B",Modifier.background(color = Color.Blue).align(Alignment.TopCenter),
                color=Color.White,
                fontSize = 80.sp)
            Text("C",Modifier.background(color = Color.Black).align(Alignment.TopEnd),
                color=Color.White,
                fontSize = 80.sp)
            Text("D",Modifier.background(color = Color.LightGray).align(Alignment.CenterStart),
                color=Color.White,
                fontSize = 80.sp)
            Text("E",Modifier.background(color = Color.Yellow).align(Alignment.Center),
                color=Color.White,
                fontSize = 80.sp)
            Text("F",Modifier.background(color = Color.Green).align(Alignment.CenterEnd),
                color=Color.White,
                fontSize = 80.sp)
            Text("G",Modifier.background(color = Color.Gray).align(Alignment.BottomStart),
                color=Color.White,
                fontSize = 80.sp)
            Text("H",Modifier.background(color = Color.Cyan).align(Alignment.BottomCenter),
                color=Color.White,
                fontSize = 80.sp)
            Text("I",Modifier.background(color = Color.Magenta).align(Alignment.BottomEnd),
                color=Color.White,
                fontSize = 80.sp)

        }
    }

}
