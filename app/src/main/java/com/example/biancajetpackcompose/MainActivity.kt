package com.example.biancajetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.biancajetpackcompose.ui.theme.BiancaJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BiancaJetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                 MainScreen()
                }
            }
        }
    }
}

@Composable
fun MainScreen() {
    var message by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.rapunzel),
            contentDescription = null,
            modifier = Modifier
                .size(150.dp)
                .padding(16.dp),
        )

        Button(
            onClick = { message = "Debug: Mensagem de Erro" },
            modifier = Modifier
                .padding(8.dp)
                .fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color.Magenta,
                contentColor = Color.White // Cor do texto branca
            )
        ) {
            Text(text = "Debug")
        }

        Button(
            onClick = { message = "Info: mensagem  que modtra as informações." },
            modifier = Modifier
                .padding(8.dp)
                .fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color.Magenta, // Cor de fundo preta
                contentColor = Color.White // Cor do texto branca
            )
        ) {
            Text(text = "Info")
        }

        Button(
            onClick = { message = "Warning: mensagem de aviso." },
            modifier = Modifier
                .padding(8.dp)
                .fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color.Magenta, // Cor de fundo preta
                contentColor = Color.White // Cor do texto branca
            )
        ) {
            Text(text = "Warning")
            Surface() {

            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = message,
            color = Color.Black,
            style = MaterialTheme.typography.body1
        )
    }
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    BiancaJetpackComposeTheme{
        MainScreen()
    }
}