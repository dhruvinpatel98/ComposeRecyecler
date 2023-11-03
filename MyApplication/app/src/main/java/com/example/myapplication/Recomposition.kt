package com.example.myapplication

import android.util.Log
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember

class Recomposition {
}
// when we have multiple UI component when data changes the only function which using
// that data will b recompose other coposable fun will not recompose
// in fun we are calling multiple compose function it will call in any order
// in compose fun we shoulld not call heavy running task it will block UI

@Composable
fun ReComposition() {
    val state = remember {
        mutableStateOf(0.0)
    }
    Log.d("TAG","Log during intial composition")
    Button(onClick = { state.value = Math.random() }) {
        Log.d("TAG","Log during intial composition and recomposition")
        Text(state.value.toString())
    }

}