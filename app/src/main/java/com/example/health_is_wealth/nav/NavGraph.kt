package com.example.health_is_wealth.nav

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.health_is_wealth.screens.HomeScreen
import com.example.health_is_wealth.screens.JournalScreen
import com.example.health_is_wealth.screens.LoginScreen

@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "login") {
        composable("login") {
            LoginScreen(navController)
        }
        composable("home") {
            HomeScreen(navController)
        }
        composable("journal") {
            JournalScreen(navController)
        }
    }
}
