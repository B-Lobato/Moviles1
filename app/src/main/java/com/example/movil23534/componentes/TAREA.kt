import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
@Preview(showBackground = true)
fun Juego() {
    var pantalla by remember { mutableStateOf("juego") }
    var nombre by remember { mutableStateOf("") }

    when (pantalla) {
        "juego" -> PantallaJuego(
            gameOver = { pantalla = "gameover" },
            volver = { pantalla = "anterior" },
            nombre = nombre,
            setNombre = { nombre = it }
        )
        "gameover" -> PantallaGameOver(
            playAgain = { pantalla = "juego" },
            nombre = nombre
        )
        "anterior" -> PantallaAnterior(
            volver = { pantalla = "juego" }
        )
    }
}

@Composable
fun PantallaAnterior(volver: () -> Unit) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFFAF8EF))
            .clickable { volver() }
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text("2048", fontSize = 48.sp, fontWeight = FontWeight.Bold, color = Color(0xFF776E65))
                Column {
                    Box(modifier = Modifier.background(Color(0xFFBBADA0)).padding(16.dp, 8.dp)) {
                        Column {
                            Text("SCORE", fontSize = 12.sp, color = Color(0xFFEEE4DA))
                            Text("1692", fontSize = 20.sp, color = Color.White)
                        }
                    }
                    Spacer(Modifier.height(8.dp))
                    Box(modifier = Modifier.background(Color(0xFFBBADA0)).padding(16.dp, 8.dp)) {
                        Column {
                            Text("BEST", fontSize = 12.sp, color = Color(0xFFEEE4DA))
                            Text("7000", fontSize = 20.sp, color = Color.White)
                        }
                    }
                }
            }

            Spacer(Modifier.height(32.dp))

            Box(modifier = Modifier.background(Color(0xFFBBADA0)).padding(8.dp)) {
                Column {
                    Row {
                        Box(Modifier.size(80.dp).background(Color(0xFFEEE4DA)).padding(4.dp), contentAlignment = Alignment.Center) {
                            Text("4", fontSize = 32.sp, color = Color(0xFF776E65))
                        }
                        Box(Modifier.size(80.dp).background(Color(0xFFF67C5F)).padding(4.dp), contentAlignment = Alignment.Center) {
                            Text("32", fontSize = 32.sp, color = Color.White)
                        }
                        Box(Modifier.size(80.dp).background(Color(0xFFF2B179)).padding(4.dp), contentAlignment = Alignment.Center) {
                            Text("8", fontSize = 32.sp, color = Color.White)
                        }
                        Box(Modifier.size(80.dp).background(Color(0xFFF67C5F)).padding(4.dp), contentAlignment = Alignment.Center) {
                            Text("32", fontSize = 32.sp, color = Color.White)
                        }
                    }
                    Row {
                        Box(Modifier.size(80.dp).background(Color(0xFFF59563)).padding(4.dp), contentAlignment = Alignment.Center) {
                            Text("16", fontSize = 32.sp, color = Color.White)
                        }
                        Box(Modifier.size(80.dp).background(Color(0xFFF65E3B)).padding(4.dp), contentAlignment = Alignment.Center) {
                            Text("64", fontSize = 32.sp, color = Color.White)
                        }
                        Box(Modifier.size(80.dp).background(Color(0xFFEEE4DA)).padding(4.dp), contentAlignment = Alignment.Center) {
                            Text("4", fontSize = 32.sp, color = Color(0xFF776E65))
                        }
                        Box(Modifier.size(80.dp).background(Color(0xFFCDC1B4)).padding(4.dp), contentAlignment = Alignment.Center) {
                            Text("")
                        }
                    }
                    Row {
                        Box(Modifier.size(80.dp).background(Color(0xFFEEE4DA)).padding(4.dp), contentAlignment = Alignment.Center) {
                            Text("2", fontSize = 32.sp, color = Color(0xFF776E65))
                        }
                        Box(Modifier.size(80.dp).background(Color(0xFFEDCF72)).padding(4.dp), contentAlignment = Alignment.Center) {
                            Text("128", fontSize = 32.sp, color = Color.White)
                        }
                        Box(Modifier.size(80.dp).background(Color(0xFFF65E3B)).padding(4.dp), contentAlignment = Alignment.Center) {
                            Text("64", fontSize = 32.sp, color = Color.White)
                        }
                        Box(Modifier.size(80.dp).background(Color(0xFFCDC1B4)).padding(4.dp), contentAlignment = Alignment.Center) {
                            Text("")
                        }
                    }
                    Row {
                        Box(Modifier.size(80.dp).background(Color(0xFFF2B179)).padding(4.dp), contentAlignment = Alignment.Center) {
                            Text("8", fontSize = 32.sp, color = Color.White)
                        }
                        Box(Modifier.size(80.dp).background(Color(0xFFCDC1B4)).padding(4.dp), contentAlignment = Alignment.Center) {
                            Text("")
                        }
                        Box(Modifier.size(80.dp).background(Color(0xFFCDC1B4)).padding(4.dp), contentAlignment = Alignment.Center) {
                            Text("")
                        }
                        Box(Modifier.size(80.dp).background(Color(0xFFCDC1B4)).padding(4.dp), contentAlignment = Alignment.Center) {
                            Text("")
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun PantallaJuego(
    gameOver: () -> Unit,
    volver: () -> Unit,
    nombre: String,
    setNombre: (String) -> Unit
) {
    var numeros by remember { mutableStateOf(List(4) { List(4) { 0 } }) }

    fun colorFondo(valor: Int): Color {
        return when (valor) {
            2 -> Color(0xFFEEE4DA)
            4 -> Color(0xFFEDE0C8)
            8 -> Color(0xFFF2B179)
            16 -> Color(0xFFF59563)
            32 -> Color(0xFFF67C5F)
            64 -> Color(0xFFF65E3B)
            128 -> Color(0xFFEDCF72)
            256 -> Color(0xFFEDCC61)
            512 -> Color(0xFFEDC850)
            1024 -> Color(0xFFEDC53F)
            2048 -> Color(0xFFEDC22E)
            else -> Color(0xFFCDC1B4)
        }
    }

    fun colorTexto(valor: Int): Color {
        return if (valor == 2 || valor == 4) Color(0xFF776E65) else Color.White
    }

    fun score(): Int {
        var total = 0
        for (i in 0..3) {
            for (j in 0..3) {
                total += numeros[i][j]
            }
        }
        return total
    }

    fun best(): Int {
        var maximo = 0
        for (i in 0..3) {
            for (j in 0..3) {
                if (numeros[i][j] > maximo) {
                    maximo = numeros[i][j]
                }
            }
        }
        return maximo
    }

    fun alguienGano(): Boolean {
        for (i in 0..3) {
            for (j in 0..3) {
                if (numeros[i][j] == 2048) {
                    return true
                }
            }
        }
        return false
    }

    fun alguienPerdio(): Boolean {
        for (i in 0..3) {
            for (j in 0..3) {
                if (numeros[i][j] > 2048) {
                    return true
                }
            }
        }
        return false
    }

    fun clickEnCelda(fila: Int, col: Int) {
        val nuevos = numeros.toMutableList().map { it.toMutableList() }
        if (nuevos[fila][col] == 0) {
            nuevos[fila][col] = 2
        } else if (nuevos[fila][col] < 2048) {
            nuevos[fila][col] = nuevos[fila][col] * 2
        } else {
            nuevos[fila][col] = 2
        }
        numeros = nuevos

        if (alguienPerdio()) {
            gameOver()
        }
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFFAF8EF))
            .padding(16.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Box(Modifier.clickable { volver() }) {
                Text("←", fontSize = 40.sp, color = Color(0xFF776E65))
            }

            Column {
                Box(Modifier.background(Color(0xFFBBADA0)).padding(16.dp, 8.dp)) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text("SCORE", fontSize = 12.sp, color = Color(0xFFEEE4DA))
                        Text(score().toString(), fontSize = 20.sp, color = Color.White)
                    }
                }
                Spacer(Modifier.height(8.dp))
                Box(Modifier.background(Color(0xFFBBADA0)).padding(16.dp, 8.dp)) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text("BEST", fontSize = 12.sp, color = Color(0xFFEEE4DA))
                        Text(best().toString(), fontSize = 20.sp, color = Color.White)
                    }
                }
            }
        }

        if (alguienGano()) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(0xFF8F7A66))
                    .padding(8.dp)
            ) {
                Text("¡GANASTE! $nombre", color = Color.White)
            }
            Spacer(Modifier.height(8.dp))
        }

        Spacer(Modifier.height(20.dp))

        Box(
            modifier = Modifier.background(Color(0xFFBBADA0)).padding(8.dp)
        ) {
            Column {
                for (i in 0..3) {
                    Row {
                        for (j in 0..3) {
                            Box(
                                modifier = Modifier
                                    .size(80.dp)
                                    .background(colorFondo(numeros[i][j]))
                                    .padding(4.dp)
                                    .clickable { clickEnCelda(i, j) },
                                contentAlignment = Alignment.Center
                            ) {
                                if (numeros[i][j] != 0) {
                                    Text(
                                        numeros[i][j].toString(),
                                        fontSize = if (numeros[i][j] > 999) 20.sp else 32.sp,
                                        color = colorTexto(numeros[i][j])
                                    )
                                }
                            }
                        }
                    }
                }
            }
        }

        Spacer(Modifier.height(20.dp))

        Box(
            modifier = Modifier
                .background(Color(0xFF8F7A66))
                .fillMaxWidth()
                .clickable {
                    numeros = List(4) { List(4) { 0 } }
                }
        ) {
            Text("Play Again", modifier = Modifier.padding(16.dp), color = Color.White)
        }

        Spacer(Modifier.height(16.dp))

        // TextField funcional
        Box(
            modifier = Modifier
                .background(Color.White)
                .fillMaxWidth()
                .padding(8.dp)
        ) {
            BasicTextField(
                value = nombre,
                onValueChange = { setNombre(it) },
                modifier = Modifier.fillMaxWidth(),
                decorationBox = { innerTextField ->
                    Box(Modifier.padding(8.dp)) {
                        if (nombre.isEmpty()) {
                            Text("Escribe tu nombre", color = Color.Gray)
                        }
                        innerTextField()
                    }
                }
            )
        }
    }
}

@Composable
fun PantallaGameOver(playAgain: () -> Unit, nombre: String) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFFAF8EF))
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Game Over", fontSize = 40.sp, color = Color(0xFF776E65))
        Spacer(Modifier.height(16.dp))
        Text("$nombre sigue participando", fontSize = 20.sp, color = Color(0xFF776E65))

        Spacer(Modifier.height(40.dp))

        Box(
            modifier = Modifier
                .background(Color(0xFF8F7A66))
                .fillMaxWidth()
                .clickable { playAgain() }
        ) {
            Text("Play Again", modifier = Modifier.padding(16.dp), color = Color.White)
        }
    }
}