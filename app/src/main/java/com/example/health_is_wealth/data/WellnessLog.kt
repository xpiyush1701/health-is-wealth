package com.example.health_is_wealth.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "wellness_log")
data class WellnessLog(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val steps: Int,
    val waterIntakeLitres: Float,
    val moodEmoji: String,
    val timestamp: Long = System.currentTimeMillis()
)
