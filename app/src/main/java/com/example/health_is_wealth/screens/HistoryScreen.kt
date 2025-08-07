package com.example.health_is_wealth.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun HistoryScreen() {
    Column(Modifier.fillMaxSize().padding(16.dp)) {
        Text("Past Days")
        Text("Day 1: View Summary")
        Text("Day 2: View Summary")
        Text("Day 3: View Summary")
    }
}
