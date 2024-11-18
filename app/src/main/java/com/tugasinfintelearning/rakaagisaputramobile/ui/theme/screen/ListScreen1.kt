package com.tugasinfintelearning.rakaagisaputramobile.ui.theme.screen

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.navigation.NavController
import com.tugasinfintelearning.rakaagisaputramobile.ui.theme.components.MealCategoryItem
import com.tugasinfintelearning.rakaagisaputramobile.viewmodel.MealViewModel

@Composable
fun ListScreen1(navController: NavController, viewModel: MealViewModel) {
    LazyColumn {
        items(viewModel.categories.value) { category ->
            MealCategoryItem(category) {
                navController.navigate("detailScreen/${category.strCategory}")
            }
        }
    }
}
