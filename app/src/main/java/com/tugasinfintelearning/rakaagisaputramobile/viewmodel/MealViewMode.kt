package com.tugasinfintelearning.rakaagisaputramobile.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.tugasinfintelearning.rakaagisaputramobile.data.model.MealCategory
import com.tugasinfintelearning.rakaagisaputramobile.data.model.repository.MealRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class MealViewModel : ViewModel() {
    private val repository = MealRepository()

    private val _categories = MutableStateFlow<List<MealCategory>>(emptyList())
    val categories: StateFlow<List<MealCategory>> = _categories

    init {
        fetchCategories()
    }

    private fun fetchCategories() {
        viewModelScope.launch {
            try {
                val data = repository.getCategories()
                _categories.value = data
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }
}
