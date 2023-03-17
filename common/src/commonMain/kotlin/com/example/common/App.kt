@file:Suppress("FunctionName")

package com.example.common

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.graphics.*
import androidx.compose.ui.unit.*

@Composable
fun App() {
    var text by remember { mutableStateOf("Helô, World!") }
    var x by remember { mutableStateOf(9999) }
    var v by remember { mutableStateOf(0) }

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(
            onClick = {
                v++
                text = if (v % 2 == 0) "Bye Victor $v" else "Helô, Victor $v"
            },
            shape = CircleShape,
            colors = ButtonDefaults.buttonColors()
        ) {
            Text(text)
        }
        GoogleButton(
            buttonText = "Google Helô",
            backgroundColor = Color.Blue,
            fontColor = Color.Black,
            onClick = { x += 1 },
            border = BorderStroke(Dp(8f), Color.Red)
        )
        LazyColumn(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            items(x) { counter -> Text("Click $counter") }
        }
    }
}
