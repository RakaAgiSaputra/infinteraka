package com.tugasinfintelearning.rakaagisaputramobile.ui.theme.screen

import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AboutScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("About Screen") }
            )
        }
    ) {
        Text(text ="", modifier = Modifier.padding(it))
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            // Gambar profil
            AsyncImage(
                model = "https://via.placeholder.com/150", // Ganti dengan URL foto Anda jika ada
                contentDescription = "Profile Picture",
                modifier = Modifier
                    .size(120.dp)
                    .clip(CircleShape)
            )

            Spacer(modifier = Modifier.height(16.dp))

            // Informasi
            Text(text = "Nama: Raka Agi Saputra", fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "Jurusan: Informatika")
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "Universitas: Universitas Teknokrat Indonesia")
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "Email: raka_agi_saputra@teknokrat.ac.id")
        }
    }
}
