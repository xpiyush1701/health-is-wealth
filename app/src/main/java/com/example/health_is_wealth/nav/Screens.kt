package com.example.health_is_wealth.nav

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Person
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Screens(val route: String, val title: String, val icon: ImageVector) {
    object Home : Screens("home", "Home", Icons.Filled.Favorite)
    object Tracker : Screens("tracker", "Tracker", Icons.Filled.List)
    object Profile : Screens("profile", "Profile", Icons.Filled.Person)
}
