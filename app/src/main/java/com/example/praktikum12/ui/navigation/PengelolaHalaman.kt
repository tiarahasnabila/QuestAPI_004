package com.example.praktikum12.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.praktikum12.ui.view.DestinasiEntry
import com.example.praktikum12.ui.view.DestinasiHome
import com.example.praktikum12.ui.view.EntryMhsScreen
import com.example.praktikum12.ui.view.HomeScreen

@Composable
fun PengelolaHalaman(
    navController: NavHostController = rememberNavController()
){
    NavHost(
        navController = navController,
        startDestination = DestinasiHome.route,
        modifier = Modifier,
    ){
        composable(DestinasiHome.route){
            HomeScreen(
                navigateToltemEntry = { navController.navigate(DestinasiEntry.route) },
                onDetailClick = {
                }
            )
        }
        composable(DestinasiEntry.route) {
            EntryMhsScreen(
                navigateBack = {
                    navController.navigate(DestinasiHome.route){
                        popUpTo(DestinasiHome.route){
                            inclusive = true
                        }
                    }
                }
            )
        }
    }
}