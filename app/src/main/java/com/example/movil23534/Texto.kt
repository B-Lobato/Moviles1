package com.example.movil23534

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun Mytxt (){
    val myFontColor = Color.Blue
    val tamainioFuente = 70.sp

    Text(
        text = stringResource(R.string.hello_word),
        color = myFontColor,
        fontSize = tamainioFuente,
        fontStyle = FontStyle.Italic,
        fontWeight = FontWeight.Light,
        fontFamily = FontFamily.Serif,
        letterSpacing = 2.sp,
        lineHeight = 70.sp,
        textDecoration = TextDecoration.None,
        textAlign = TextAlign.Center,
        maxLines = 4,
        //minLines = 2
        overflow = TextOverflow.Ellipsis,

        )
}

