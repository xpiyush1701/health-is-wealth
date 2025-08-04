package com.example.health_is_wealth.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface WellnessDao {
    @Insert
    suspend fun insertLog(log: WellnessLog)

    @Query("SELECT * FROM wellness_log ORDER BY timestamp DESC LIMIT 1")
    suspend fun getLatestLog(): WellnessLog?
}
