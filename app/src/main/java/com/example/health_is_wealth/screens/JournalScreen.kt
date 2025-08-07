package com.example.health_is_wealth.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun JournalScreen(navController: NavController) {
    val emojis = listOf("😃", "😐", "😢", "😠")
    var selectedEmoji by rememberSaveable { mutableStateOf("") }
    var journalText by rememberSaveable { mutableStateOf(TextFieldValue("")) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("How are you feeling today?", style = MaterialTheme.typography.titleLarge)
        Spacer(modifier = Modifier.height(16.dp))

        Row(
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier.fillMaxWidth()
        ) {
            emojis.forEach { emoji ->
                Text(
                    text = emoji,
                    modifier = Modifier
                        .size(48.dp)
                        .background(
                            if (selectedEmoji == emoji) Color.LightGray else Color.Transparent,
                            shape = CircleShape
                        )
                        .clickable { selectedEmoji = emoji }
                        .padding(8.dp),
                    style = MaterialTheme.typography.headlineMedium
                )
            }
        }

        Spacer(modifier = Modifier.height(24.dp))

        OutlinedTextField(
            value = journalText,
            onValueChange = { journalText = it },
            modifier = Modifier.fillMaxWidth(),
            label = { Text("Write your thoughts here...") },
            maxLines = 6
        )

        Spacer(modifier = Modifier.height(24.dp))

        Button(
            onClick = {
                // Fake save logic for now
                println("Mood: $selectedEmoji, Note: ${journalText.text}")
                selectedEmoji = ""
                journalText = TextFieldValue("")
            },
            modifier = Modifier.align(Alignment.End)
        ) {
            Text("Save Entry")
        }
    }
}
