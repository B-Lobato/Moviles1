/*import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
@Preview(showBackground = true)
@Composable
fun Pantalla() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFFAF8EF))
            .padding(16.dp)
    ) {
        Box {
            Text("Game Over", fontSize = 40.sp, color = Color(0xFF776E65))
        }

        Box {
            Text("7000 points in 476 moves.", color = Color(0xFF776E65))
        }

        Box {
            Text("2 powerups used:", color = Color(0xFF776E65))
        }

        Spacer(Modifier.height(16.dp))

        Box(
            modifier = Modifier.background(Color(0xFFBBADA0))
        ) {
            Column {
                Box {
                    Row {
                        Box(
                            modifier = Modifier
                                .size(80.dp)
                                .background(Color(0xFFE8D4C4))
                        ) {
                            Text("3", modifier = Modifier.padding(24.dp), color = Color(0xFF776E65))
                        }
                        Box(
                            modifier = Modifier
                                .size(80.dp)
                                .background(Color(0xFFEEE4DA))
                        ) {
                            Text("2", modifier = Modifier.padding(24.dp), color = Color(0xFF776E65))
                        }
                        Box(
                            modifier = Modifier
                                .size(80.dp)
                                .background(Color(0xFFF67C5F))
                        ) {
                            Text("32", modifier = Modifier.padding(24.dp), color = Color.White)
                        }
                        Box(
                            modifier = Modifier
                                .size(80.dp)
                                .background(Color(0xFFEEE4DA))
                        ) {
                            Text("2", modifier = Modifier.padding(24.dp), color = Color(0xFF776E65))
                        }
                    }
                }
                Box {
                    Row {
                        Box(
                            modifier = Modifier
                                .size(80.dp)
                                .background(Color(0xFFEDE0C8))
                        ) {
                            Text("4", modifier = Modifier.padding(24.dp), color = Color(0xFF776E65))
                        }
                        Box(
                            modifier = Modifier
                                .size(80.dp)
                                .background(Color(0xFFEDE0C8))
                        ) {
                            Text("4", modifier = Modifier.padding(24.dp), color = Color(0xFF776E65))
                        }
                        Box(
                            modifier = Modifier
                                .size(80.dp)
                                .background(Color(0xFFF65E3B))
                        ) {
                            Text("64", modifier = Modifier.padding(24.dp), color = Color.White)
                        }
                        Box(
                            modifier = Modifier
                                .size(80.dp)
                                .background(Color(0xFFEDE0C8))
                        ) {
                            Text("4", modifier = Modifier.padding(24.dp), color = Color(0xFF776E65))
                        }
                    }
                }
                Box {
                    Row {
                        Box(
                            modifier = Modifier
                                .size(80.dp)
                                .background(Color(0xFFEDCF72))
                        ) {
                            Text("128", modifier = Modifier.padding(16.dp), color = Color.White)
                        }
                        Box(
                            modifier = Modifier
                                .size(80.dp)
                                .background(Color(0xFFF2B179))
                        ) {
                            Text("8", modifier = Modifier.padding(24.dp), color = Color.White)
                        }
                        Box(
                            modifier = Modifier
                                .size(80.dp)
                                .background(Color(0xFFEDCC61))
                        ) {
                            Text("256", modifier = Modifier.padding(16.dp), color = Color.White)
                        }
                        Box(
                            modifier = Modifier
                                .size(80.dp)
                                .background(Color(0xFFEDC850))
                        ) {
                            Text("512", modifier = Modifier.padding(16.dp), color = Color.White)
                        }
                    }
                }
                Box {
                    Row {
                        Box(
                            modifier = Modifier
                                .size(80.dp)
                                .background(Color(0xFFF2B179))
                        ) {
                            Text("8", modifier = Modifier.padding(24.dp), color = Color.White)
                        }
                        Box(
                            modifier = Modifier
                                .size(80.dp)
                                .background(Color(0xFFEDE0C8))
                        ) {
                            Text("4", modifier = Modifier.padding(24.dp), color = Color(0xFF776E65))
                        }
                        Box(
                            modifier = Modifier
                                .size(80.dp)
                                .background(Color(0xFFF2B179))
                        ) {
                            Text("8", modifier = Modifier.padding(24.dp), color = Color.White)
                        }
                        Box(
                            modifier = Modifier
                                .size(80.dp)
                                .background(Color(0xFFEEE4DA))
                        ) {
                            Text("2", modifier = Modifier.padding(24.dp), color = Color(0xFF776E65))
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
        ) {
            Text("Play Again", modifier = Modifier.padding(16.dp), color = Color.White)
        }

        Spacer(Modifier.height(8.dp))

        Box(
            modifier = Modifier
                .background(Color(0xFFCDC1B4))
                .fillMaxWidth()
        ) {
            Text("Undo", modifier = Modifier.padding(16.dp), color = Color(0xFF776E65))
        }

        Box {
            Text("You're out of undos!", color = Color(0xFF776E65))
        }
    }
}*/