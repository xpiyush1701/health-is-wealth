package com.example.health_is_wealth

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.health_is_wealth.ui.theme.HealthiswealthTheme
import com.example.health_is_wealth.screens.LoginScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HealthiswealthTheme {
                // Render your actual Login screen
                LoginScreen(onLoginClick = { /* handle login later */ })
            }
        }
    }
}
