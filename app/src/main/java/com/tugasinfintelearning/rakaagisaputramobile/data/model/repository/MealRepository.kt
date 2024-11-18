package com.tugasinfintelearning.rakaagisaputramobile.data.model.repository

import com.tugasinfintelearning.rakaagisaputramobile.data.model.MealCategory
import com.tugasinfintelearning.rakaagisaputramobile.network.RetrofitInstance

class MealRepository {
    private val api = RetrofitInstance.api

    suspend fun getCategories(): List<MealCategory> {
        return api.getCategories().categories
    }
}
