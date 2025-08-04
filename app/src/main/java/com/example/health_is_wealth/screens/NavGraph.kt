// NavGraph.kt
package com.example.health_is_wealth.screens
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun AppNavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "login") {

        composable("login") {
            LoginScreen(onLoginClick = {
                navController.navigate("dashboard")
            })
        }

        composable("dashboard") {
            Scaffold(
                bottomBar = { BottomBar(navController) }
            ) { paddingValues ->
                DashboardScreen(modifier = Modifier.padding(paddingValues))
            }
        }

        composable("settings") {
            Scaffold(
                bottomBar = { BottomBar(navController) }
            ) { paddingValues ->
                SettingsScreen(modifier = Modifier.padding(paddingValues))
            }
        }
    }
}
