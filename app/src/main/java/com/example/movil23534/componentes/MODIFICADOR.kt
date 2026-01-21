package com.example.movil23534.componentes
import android.R
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun Modificador(){
    Text("Hola mundo",
        //modifier = Modifier.fillMaxSize()
        modifier = Modifier//.fillMaxHeight()
            .rotate(10f)
            .background(Color.Black)
            .padding(all = 7.dp)
            .background(Color(color = 0xFFFD6F04))
            .padding(vertical = 14.dp)
            .rotate(-30f)
            .alpha(1f)
            //.blur(8.dp)
            //.border(1.dp,Color.w)
            .shadow(20.dp),
        color=Color.White,
        fontSize = 12.sp
    )
}
