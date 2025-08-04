package com.example.health_is_wealth.screens

import android.app.Application
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.health_is_wealth.data.WellnessDatabase
import kotlinx.coroutines.launch

class DashboardViewModel(application: Application) : AndroidViewModel(application) {
    private val dao = WellnessDatabase.getDatabase(application).wellnessDao()
    private val repository = DashboardRepository(dao)

    var dashboardState = mutableStateOf(DashboardState())
        private set

    init {
        loadDashboard()
    }

    private fun loadDashboard() {
        viewModelScope.launch {
            dashboardState.value = repository.getLatestDashboardState()
        }
    }

    fun saveDashboard() {
        viewModelScope.launch {
            repository.saveDashboardState(dashboardState.value)
        }
    }
}
