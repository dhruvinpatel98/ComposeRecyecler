package com.example.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class ComposeState {
    //As data change it call composable so it will recreate so we define value in composable than reintialize
    //ASo we using remember so it will remember the value
    // when rotate phone then it reintialize all thing so we have use remembersave sot it will remember the value even rotate the phone
}

@Composable
fun NotificationScreen() {
    Column(verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()) {
        val count = rememberSaveable {
            mutableStateOf(0)
        }
        NotificationCounter(count.value) { count.value++ }
        MessageShow(count.value)
    }
}

@Composable
fun MessageShow(count: Int) {
    Card {
        Row(verticalAlignment = Alignment.CenterVertically
        ,
            modifier = Modifier.padding(8.dp)) {
            Image(
                imageVector = Icons.Outlined.Favorite,
                contentDescription = "",
                modifier = Modifier.padding(4.dp)
            )
            Text("Message sent so far $count")
        }
    }
}

@Composable
fun NotificationCounter(count: Int, function: () -> Unit) {
    Column (verticalArrangement = Arrangement.Center){
        Text(text = "No Of Notification sent ${count}")
        Button(onClick = { function() }) {
            Text("Send Notification")
        }
    }

}