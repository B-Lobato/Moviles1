import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
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
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Box {
                Text(
                    text = "2048",
                    fontSize = 48.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF776E65)
                )
            }

            Column {
                Box(
                    modifier = Modifier.background(Color(0xFFBBADA0))
                        .padding(horizontal = 16.dp, vertical = 8.dp)
                ) {
                    Column {
                        Text("SCORE", fontSize = 12.sp, color = Color(0xFFEEE4DA), fontWeight = FontWeight.Bold)
                        Text("1692", fontSize = 20.sp, color = Color.White, fontWeight = FontWeight.Bold)
                    }
                }
                Spacer(modifier = Modifier.height(8.dp))
                Box(
                    modifier = Modifier.background(Color(0xFFBBADA0))
                        .padding(horizontal = 16.dp, vertical = 8.dp)
                ) {
                    Column {
                        Text("BEST", fontSize = 12.sp, color = Color(0xFFEEE4DA), fontWeight = FontWeight.Bold)
                        Text("7000", fontSize = 20.sp, color = Color.White, fontWeight = FontWeight.Bold)
                    }
                }
            }
        }

        Spacer(modifier = Modifier.height(32.dp))

        Box(
            modifier = Modifier.background(Color(0xFFBBADA0))
                .padding(8.dp)
        ) {
            Column {
                Box {
                    Row {
                        Box(
                            modifier = Modifier
                                .size(80.dp)
                                .background(Color(0xFFEEE4DA))
                                .padding(4.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Text("4", fontSize = 32.sp, fontWeight = FontWeight.Bold, color = Color(0xFF776E65))
                        }
                        Box(
                            modifier = Modifier
                                .size(80.dp)
                                .background(Color(0xFFF67C5F))
                                .padding(4.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Text("32", fontSize = 32.sp, fontWeight = FontWeight.Bold, color = Color.White)
                        }
                        Box(
                            modifier = Modifier
                                .size(80.dp)
                                .background(Color(0xFFF2B179))
                                .padding(4.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Text("8", fontSize = 32.sp, fontWeight = FontWeight.Bold, color = Color.White)
                        }
                        Box(
                            modifier = Modifier
                                .size(80.dp)
                                .background(Color(0xFFF67C5F))
                                .padding(4.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Text("32", fontSize = 32.sp, fontWeight = FontWeight.Bold, color = Color.White)
                        }
                    }
                }
                Box {
                    Row {
                        Box(
                            modifier = Modifier
                                .size(80.dp)
                                .background(Color(0xFFF59563))
                                .padding(4.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Text("16", fontSize = 32.sp, fontWeight = FontWeight.Bold, color = Color.White)
                        }
                        Box(
                            modifier = Modifier
                                .size(80.dp)
                                .background(Color(0xFFF65E3B))
                                .padding(4.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Text("64", fontSize = 32.sp, fontWeight = FontWeight.Bold, color = Color.White)
                        }
                        Box(
                            modifier = Modifier
                                .size(80.dp)
                                .background(Color(0xFFEEE4DA))
                                .padding(4.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Text("4", fontSize = 32.sp, fontWeight = FontWeight.Bold, color = Color(0xFF776E65))
                        }
                        Box(
                            modifier = Modifier
                                .size(80.dp)
                                .background(Color(0xFFCDC1B4))
                                .padding(4.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Text("", fontSize = 32.sp, fontWeight = FontWeight.Bold)
                        }
                    }
                }
                Box {
                    Row {
                        Box(
                            modifier = Modifier
                                .size(80.dp)
                                .background(Color(0xFFEEE4DA))
                                .padding(4.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Text("2", fontSize = 32.sp, fontWeight = FontWeight.Bold, color = Color(0xFF776E65))
                        }
                        Box(
                            modifier = Modifier
                                .size(80.dp)
                                .background(Color(0xFFEDCF72))
                                .padding(4.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Text("128", fontSize = 32.sp, fontWeight = FontWeight.Bold, color = Color.White)
                        }
                        Box(
                            modifier = Modifier
                                .size(80.dp)
                                .background(Color(0xFFF65E3B))
                                .padding(4.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Text("64", fontSize = 32.sp, fontWeight = FontWeight.Bold, color = Color.White)
                        }
                        Box(
                            modifier = Modifier
                                .size(80.dp)
                                .background(Color(0xFFCDC1B4))
                                .padding(4.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Text("", fontSize = 32.sp, fontWeight = FontWeight.Bold)
                        }
                    }
                }
                Box {
                    Row {
                        Box(
                            modifier = Modifier
                                .size(80.dp)
                                .background(Color(0xFFF2B179))
                                .padding(4.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Text("8", fontSize = 32.sp, fontWeight = FontWeight.Bold, color = Color.White)
                        }
                        Box(
                            modifier = Modifier
                                .size(80.dp)
                                .background(Color(0xFFCDC1B4))
                                .padding(4.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Text("", fontSize = 32.sp, fontWeight = FontWeight.Bold)
                        }
                        Box(
                            modifier = Modifier
                                .size(80.dp)
                                .background(Color(0xFFCDC1B4))
                                .padding(4.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Text("", fontSize = 32.sp, fontWeight = FontWeight.Bold)
                        }
                        Box(
                            modifier = Modifier
                                .size(80.dp)
                                .background(Color(0xFFCDC1B4))
                                .padding(4.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Text("", fontSize = 32.sp, fontWeight = FontWeight.Bold)
                        }
                    }
                }
            }
        }
    }
}