//Created by canVarli on 12/14/2024

package com.example.workingstructure.ui.screens

import android.util.Log
import androidx.activity.compose.BackHandler
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp

@Composable
fun DetailScreen(message: String) {
    // Geri tuşuna basıldığında çalışacak kodlar buraya yazılır.
    // true olursa geri tuşu işlevsiz hale gelir.
    // false olursa geri tuşu çalışır.
    BackHandler(false) {
        Log.e("DetailScreen", "BackHandler")
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Detail Screen", fontSize = 30.sp)
        Text(text = message, fontSize = 20.sp)
    }
}