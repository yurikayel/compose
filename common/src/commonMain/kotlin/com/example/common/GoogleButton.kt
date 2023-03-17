@file:Suppress("FunctionName")

package com.example.common

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun GoogleButton(
    modifier: Modifier = Modifier,
    buttonText: String,
    onClick: (isEnabled: Boolean) -> Unit = {},
    enable: Boolean = true,
    backgroundColor: Color,
    fontColor: Color,
    border: BorderStroke = BorderStroke(Dp(2f), Color.Green)
) {
    Button(
        onClick = { onClick(enable) },
        modifier = modifier
            .fillMaxWidth()
            .shadow(0.dp),
        elevation = ButtonDefaults.elevation(
            defaultElevation = 0.dp,
            pressedElevation = 0.dp,
            hoveredElevation = 0.dp,
            focusedElevation = 0.dp
        ),
        shape = RoundedCornerShape(28.dp),
        contentPadding = PaddingValues(15.dp),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = backgroundColor,
            contentColor = fontColor
        ),
        border = border
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.CenterStart)
            ) {
                Spacer(modifier = Modifier.width(4.dp))
            }
            Text(
                modifier = Modifier.align(Alignment.Center),
                text = buttonText,
                color = Color.Magenta,
                textAlign = TextAlign.Center,
                fontSize = 16.sp,
            )
        }
    }
}