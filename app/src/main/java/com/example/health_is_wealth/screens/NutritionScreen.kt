// src/main/java/com/example/health_is_wealth/screens/NutritionScreen.kt

package com.example.health_is_wealth.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.health_is_wealth.WellnessViewModel

/**
 * NutritionLogger UI.
 * - Inputs for calories, protein, and water.
 * - Persists data in ViewModel on save.
 * - Return to home on save or back.
 */
@Composable
fun NutritionScreen(
    navController: NavController,
    vm: WellnessViewModel
) {
    var caloriesInput by remember { mutableStateOf(vm.calories.value) }
    var proteinInput  by remember { mutableStateOf(vm.protein.value) }
    var waterInput    by remember { mutableStateOf(vm.water.value) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(text = "Log Nutrition")

        OutlinedTextField(
            value = caloriesInput,
            onValueChange = { caloriesInput = it },
            modifier = Modifier.fillMaxWidth(),
            label = { Text("Calories") }
        )

        OutlinedTextField(
            value = proteinInput,
            onValueChange = { proteinInput = it },
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 8.dp),
            label = { Text("Protein (g)") }
        )

        OutlinedTextField(
            value = waterInput,
            onValueChange = { waterInput = it },
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 8.dp),
            label = { Text("Water (L)") }
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = {
                vm.calories.value = caloriesInput
                vm.protein.value  = proteinInput
                vm.water.value    = waterInput
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
