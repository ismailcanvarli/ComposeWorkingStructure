//Created by canVarli on 12/14/2024

package com.example.workingstructure.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import com.example.workingstructure.R

// BottomBarScreen içeriği buraya yazılacak.
@Composable
fun BottomBarScreen(navController: NavController) {
    Scaffold(
        bottomBar = {
            BottomAppBar {
                NavigationBarItem(
                    label = { Text("Home Screen") },
                    onClick = { navController.navigate("homeScreen") },
                    selected = false,
                    icon = {
                        Icon(
                            painter = painterResource(id = R.drawable.home_screen_icon),
                            contentDescription = "HomeScreen"
                        )
                    }
                )
                NavigationBarItem(
                    label = { Text("Setting Screen") },
                    onClick = { navController.navigate("settingScreen") },
                    selected = false,
                    icon = {
                        Icon(
                            painter = painterResource(id = R.drawable.setting_icon),
                            contentDescription = "SettingScreen"
                        )
                    }
                )
            }
        }
    ) { paddingValues ->
        Column(modifier = Modifier.padding(paddingValues)) {
            // Buraya sayfa içeriği yazılacak.
        }
    }
}