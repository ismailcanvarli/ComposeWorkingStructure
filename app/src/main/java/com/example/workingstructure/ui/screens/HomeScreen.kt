//Created by canVarli on 12/14/2024

package com.example.workingstructure.ui.screens

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun HomeScreen(navController: NavController) {
    val timer = remember { mutableStateOf(0) }
    LaunchedEffect(key1 = true) {
        // Sayfa açıldığında yada geri döndüğünde çalışacak kodlar buraya yazılır.
        Log.e("HomeScreen", "LaunchedEffect")
    }

    DisposableEffect(Unit) {
        onDispose {
            // Sayfa kapatıldığında çalışacak kodlar buraya yazılır.
            Log.e("HomeScreen", "LaunchedEffect")
        }
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Home Screen", fontSize = 30.sp)
        Text(text = "Timer: ${timer.value}", fontSize = 20.sp)
        Button(onClick = {
            timer.value++
        }) {
            Text(text = "Click")
        }
        Button(onClick = {
            if (timer.value == 10) {
                navController.navigate("detailScreen/İsmail") {
                    popUpTo("homeScreen") {
                        inclusive = true
                    }
                }
            } else {
                navController.navigate("detailScreen/${timer.value}") {
                    popUpTo("homeScreen") {
                        inclusive = true
                    }
                }
            }
        }) {
            Text(text = "Detail")
        }
    }
}