package com.tugasinfintelearning.rakaagisaputramobile.ui.theme.screen
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil.compose.AsyncImage

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailScreen(navController: NavController, foodName: String) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Detail Screen") },
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(
                            imageVector = androidx.compose.material.icons.Icons.Default.ArrowBack,
                            contentDescription = "Back"
                        )
                    }
                }
            )
        }
    ) {
        Text(text = "", modifier = Modifier.padding(it))
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            // Gambar
            AsyncImage(
                model = "https://www.themealdb.com/images/category/$foodName.png",
                contentDescription = foodName,
                modifier = Modifier.size(200.dp)
            )

            Spacer(modifier = Modifier.height(16.dp))

            // Informasi
            Text(text = foodName, fontWeight = FontWeight.Bold, modifier = Modifier.padding(8.dp))
            Text(
                text = "Deskripsi untuk makanan $foodName. Ini adalah kategori makanan yang sangat lezat dan populer di berbagai belahan dunia.",
                modifier = Modifier.padding(8.dp)
            )
        }
    }
}
