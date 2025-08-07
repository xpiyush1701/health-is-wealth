// src/main/java/com/example/health_is_wealth/nav/Navigation.kt

package com.example.health_is_wealth.nav

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.health_is_wealth.WellnessViewModel
import com.example.health_is_wealth.screens.*

/**
 * Navigation graph.
 * - Defines routes for login, home, and feature screens.
 * - Supplies shared ViewModel instance.
 */
@Composable
fun Navigation() {
    val navController = rememberNavController()
    val vm = viewModel<WellnessViewModel>()

    NavHost(navController, startDestination = Screens.Login.route) {
        composable(Screens.Login.route) { LoginScreen(navController) }
        composable(Screens.Home.route)  { HomeScreen(navController, vm) }
        composable(Screens.Steps.route) { StepsScreen(navController, vm) }
        composable(Screens.Nutrition.route) { NutritionScreen(navController, vm) }
        composable(Screens.Sleep.route) { SleepScreen(navController, vm) }
        composable(Screens.Journal.route) { JournalScreen(navController, vm) }
        composable(Screens.History.route) { HistoryScreen() }
    }
}
