package com.example.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

class RowColumn {
}

@Composable
fun showEmployees() {
    Column {
        showProfile(name = "Dhruvin Patel", profession = "Software Engineer")
        showProfile(name = "Kartik Patel", profession = "Lead Engineer")
        showProfile(name = "Hem Patel", profession = "Cheif Engineer")
    }
}

@Composable
fun showProfile(name: String, profession: String) {

    Row(modifier = Modifier.fillMaxWidth(1f)) {
        Image(painter = painterResource(id = R.drawable.avatar), contentDescription = "")
        Column {
            Text(
                name, fontWeight = FontWeight.Bold,
                fontSize = 22.sp
            )
            Text(
                profession,
                fontWeight = FontWeight.Thin
            )
        }
    }

}

//box is used put two imag on eacch other