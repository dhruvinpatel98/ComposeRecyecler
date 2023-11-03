package com.example.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.util.QuoteList



@Composable
fun showQuoteList() {
    val quoteList = QuoteList.quoteList
    LazyColumn() {
        items(quoteList) {
            QuoteListItem(quote = it.quote, author = it.author)
        }
    }
}

@Composable
fun QuoteListItem(quote: String, author: String) {
    Card(
        elevation = CardDefaults.cardElevation(
            defaultElevation = 4.dp
        ),
        modifier = Modifier.padding(8.dp)
    ) {
        Row(modifier = Modifier.padding(16.dp)) {
            Image(
                imageVector = Icons.Filled.Favorite,
                alignment = Alignment.TopStart,
                colorFilter = ColorFilter.tint(Color.White),
                contentDescription = "Quote",
                modifier = Modifier
                    .size(40.dp)
                    .background(Color.Black)
            )
            Spacer(modifier = Modifier.padding(4.dp))
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    quote, modifier = Modifier.padding(0.dp, 0.dp, 0.dp, 8.dp),
                    style = MaterialTheme.typography.bodyLarge
                )
                Box(
                    modifier = Modifier
                        .fillMaxWidth(.4f)
                        .background(Color.Black)
                        .height(1.dp)

                )
                Text(
                    author,
                    modifier = Modifier.padding(0.dp, 0.dp, 0.dp, 8.dp),
                    style = MaterialTheme.typography.bodySmall
                )
            }
        }
    }
}