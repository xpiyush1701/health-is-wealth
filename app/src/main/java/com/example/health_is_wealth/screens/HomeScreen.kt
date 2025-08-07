package com.example.health_is_wealth.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(title = { Text("Home") })
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .padding(16.dp)
                .fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("Welcome to Health is Wealth!", style = MaterialTheme.typography.headlineSmall)

            // Example metrics
            MetricCard("Steps Walked", "6,400")
            MetricCard("Water Intake", "2.1 L")
            MetricCard("Calories Consumed", "1,850")

            // Navigate to journal
            Button(onClick = { navController.navigate("journal") }) {
                Text("Open Journal")
            }
        }
    }
}

@Composable
fun MetricCard(title: String, value: String) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp),
        elevation = CardDefaults.cardElevation(4.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            contentAlignment = Alignment.CenterStart
        ) {
            Column {
                Text(text = title, style = MaterialTheme.typography.labelLarge)
                Text(text = value, style = MaterialTheme.typography.headlineSmall)
            }
        }
    }
}
