// src/main/java/com/example/health_is_wealth/ui/theme/Theme.kt

package com.example.health_is_wealth.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable

/**
 * Dark color scheme.
 * - Applies consistent styling across app.
 */
private val DarkColorScheme = darkColorScheme()

@Composable
fun HealthIsWealthTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = DarkColorScheme,
        content = content
    )
}
