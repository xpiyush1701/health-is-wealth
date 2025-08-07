// src/main/java/com/example/health_is_wealth/screens/SleepScreen.kt

package com.example.health_is_wealth.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.health_is_wealth.WellnessViewModel

/**
 * SleepTracker UI.
 * - Displays fields for hours and mood.
 * - Saves inputs into ViewModel.
 * - Navigates back to home on save or back.
 */
@Composable
fun SleepScreen(
    navController: NavController,
    vm: WellnessViewModel
) {
    var hoursInput by remember { mutableStateOf(vm.hours.value) }
    var moodInput  by remember { mutableStateOf(vm.sleepMood.value) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(text = "Sleep Tracker")

        OutlinedTextField(
            value = hoursInput,
            onValueChange = { hoursInput = it },
            modifier = Modifier.fillMaxWidth(),
            label = { Text("Hours slept") }
        )

        OutlinedTextField(
            value = moodInput,
            onValueChange = { moodInput = it },
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 8.dp),
            label = { Text("Mood (emoji)") }
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = {
                vm.hours.value = hoursInput
                vm.sleepMood.value = moodInput
                navController.popBackStack()
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Save")
        }

        OutlinedButton(
            onClick = { navController.popBackStack() },
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 8.dp)
        ) {
            Text("Back to Home")
        }
    }
}
