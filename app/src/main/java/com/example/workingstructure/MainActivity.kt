package com.example.workingstructure

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.workingstructure.ui.screens.NavHoster
import com.example.workingstructure.ui.theme.WorkingStructureTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WorkingStructureTheme {
                NavHoster()
            }
        }
    }
}