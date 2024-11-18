package com.tugasinfintelearning.rakaagisaputramobile.network

import com.tugasinfintelearning.rakaagisaputramobile.data.model.MealCategoryResponse
import retrofit2.http.GET

interface MealApiService {
    @GET("categories.php")
    suspend fun getCategories(): MealCategoryResponse
}