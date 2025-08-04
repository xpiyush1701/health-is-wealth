package com.example.health_is_wealth.screens

import com.example.health_is_wealth.data.WellnessDao
import com.example.health_is_wealth.data.WellnessLog

class DashboardRepository(private val dao: WellnessDao) {
    suspend fun getLatestDashboardState(): DashboardState {
        val log = dao.getLatestLog()
        return if (log != null) {
            DashboardState(
                steps = log.steps,
                waterIntakeLitres = log.waterIntakeLitres,
                moodEmoji = log.moodEmoji
            )
        } else {
            DashboardState()
        }
    }

    suspend fun saveDashboardState(state: DashboardState) {
        val log = WellnessLog(
            steps = state.steps,
            waterIntakeLitres = state.waterIntakeLitres,
            moodEmoji = state.moodEmoji
        )
        dao.insertLog(log)
    }
}
