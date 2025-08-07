// src/main/java/com/example/health_is_wealth/screens/StepsScreen.kt
package com.example.health_is_wealth.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.health_is_wealth.WellnessViewModel

@Composable
fun StepsScreen(navController: NavController, vm: WellnessViewModel) {
    var stepsInput   by remember { mutableStateOf(vm.steps.value) }
    var runTimeInput by remember { mutableStateOf(vm.runTime.value) }

    Column(Modifier.fillMaxSize().padding(16.dp)) {
        Text("Track Steps")
        OutlinedTextField(
            value = stepsInput,
            onValueChange = { stepsInput = it },
            label = { Text("Steps walked") },
            modifier = Modifier.fillMaxWidth()
        )
        OutlinedTextField(
            value = runTimeInput,
            onValueChange = { runTimeInput = it },
            label = { Text("Run time (mins)") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(Modifier.height(16.dp))

        Button(onClick = {
            // Save into VM and go back
            vm.steps.value   = stepsInput
            vm.runTime.value = runTimeInput
            navController.popBackStack()
        }, modifier = Modifier.fillMaxWidth()) {
            Text("Save")
        }

        Spacer(Modifier.height(8.dp))

        OutlinedButton(onClick = { navController.popBackStack() }, modifier = Modifier.fillMaxWidth()) {
            Text("Back to Home")
        }
    }
}
