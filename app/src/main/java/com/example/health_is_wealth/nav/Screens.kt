package com.example.health_is_wealth.nav

sealed class Screens(val route: String) {
    object Login     : Screens("login")
    object Home      : Screens("home")
    object Steps     : Screens("steps")
    object Nutrition : Screens("nutrition")
    object Sleep     : Screens("sleep")
    object Journal   : Screens("journal")
    object History   : Screens("history")
}
