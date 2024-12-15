//Created by canVarli on 12/14/2024

package com.example.workingstructure.ui.screens

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

@Composable
fun NavHoster() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "bottomBarScreen") {
        composable("bottomBarScreen") {
            BottomBarScreen(navController = navController)
        }
        composable("homeScreen") {
            HomeScreen(navController = navController)
        }
        composable("detailScreen/{message}",
            arguments = listOf(navArgument("message") { type = NavType.StringType })
        ) {
            val message = it.arguments?.getString("message")
            DetailScreen(message = message ?: "No message found")
        }
        composable("settingScreen") {
            SettingScreen()
        }
    }
}