package com.example.frontend.Screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Button
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GridScreen(navController: NavHostController) {
    Column {
        CenterAlignedTopAppBar(title = { Text("Grid Screen") })

        LazyVerticalGrid(columns = GridCells.Fixed(2)) {
            items(10) { index ->
                Button(onClick = { navController.navigate("detail/$index") }) {
                    Text("Item $index")
                }
            }
        }
    }
}