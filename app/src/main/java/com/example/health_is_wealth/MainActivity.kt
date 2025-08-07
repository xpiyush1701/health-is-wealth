// src/main/java/com/example/health_is_wealth/MainActivity.kt

package com.example.health_is_wealth

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.health_is_wealth.nav.Navigation
import com.example.health_is_wealth.ui.theme.HealthIsWealthTheme

/**
 * Entry point.
 * - Applies app theme.
 * - Hosts Navigation graph.
 */
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HealthIsWealthTheme {
                Navigation()
            }
        }
    }
}
