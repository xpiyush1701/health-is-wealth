// src/main/java/com/example/health_is_wealth/screens/HomeScreen.kt
package com.example.health_is_wealth.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.health_is_wealth.WellnessViewModel
import com.example.health_is_wealth.nav.Screens

@Composable
fun HomeScreen(navController: NavController, vm: WellnessViewModel) {
    Column(
        Modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Column {
            Text("Today's Summary", style = androidx.compose.material3.MaterialTheme.typography.headlineMedium)
            Spacer(Modifier.height(16.dp))

            // Pull from ViewModel
            Text("Steps: ${vm.steps.value}")
            Text("Run time: ${vm.runTime.value} mins")
            Spacer(Modifier.height(8.dp))

            Text("Calories: ${vm.calories.value}")
            Text("Protein: ${vm.protein.value} g")
            Text("Water: ${vm.water.value} L")
            Spacer(Modifier.height(8.dp))

            Text("Sleep: ${vm.hours.value} h")
            Text("Mood: ${vm.sleepMood.value}")
            Spacer(Modifier.height(8.dp))

            Text("Journal Mood: ${vm.journalMood.value}")
            Text("Note: ${vm.journalNote.value}")
        }

        Column(
            Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Button({ navController.navigate(Screens.Steps.route)     }, Modifier.fillMaxWidth()) { Text("Steps") }
            Button({ navController.navigate(Screens.Nutrition.route) }, Modifier.fillMaxWidth()) { Text("Nutrition") }
            Button({ navController.navigate(Screens.Sleep.route)     }, Modifier.fillMaxWidth()) { Text("Sleep") }
            Button({ navController.navigate(Screens.Journal.route)   }, Modifier.fillMaxWidth()) { Text("Journal") }
            Button({ navController.navigate(Screens.History.route)   }, Modifier.fillMaxWidth()) { Text("History") }
        }
    }
}
