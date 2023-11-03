package com.example.myapplication

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember

object TextFieldExample {


    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun StyledTextField() {
        var text = remember { mutableStateOf("") }
        TextField(
            value = text.value,
            onValueChange = {
                text.value = it
            },
            placeholder = { Text("Enter Your Name") }
        )
    }
}

