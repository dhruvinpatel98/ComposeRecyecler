package com.example.myapplication

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@Composable
fun TextModifier() {
    Text(
        text = "Dhruvin Patel",
        color= Color.Black,
        modifier = Modifier
            .background(Color.Green)
            .size(200.dp)
            .width(22.dp)
            .padding(20.dp)
            .clip(CircleShape)
            .background(Color.Blue)

    )
}