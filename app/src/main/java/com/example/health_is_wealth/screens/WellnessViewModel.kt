// src/main/java/com/example/health_is_wealth/WellnessViewModel.kt
package com.example.health_is_wealth

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class WellnessViewModel : ViewModel() {
    // Steps
    val steps   = mutableStateOf("")
    val runTime = mutableStateOf("")

    // Nutrition
    val calories = mutableStateOf("")
    val protein  = mutableStateOf("")
    val water    = mutableStateOf("")

    // Sleep
    val hours     = mutableStateOf("")
    val sleepMood = mutableStateOf("")

    // Journal
    val journalMood = mutableStateOf("")
    val journalNote = mutableStateOf("")
}
