package pe.upeu.navigationjpc.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import pe.upeu.navigationjpc.ui.presentation.screens.HomeScreen
import pe.upeu.navigationjpc.ui.presentation.screens.ProfileScreen
import pe.upeu.navigationjpc.ui.presentation.screens.SettingsScreen
//Rutas
@Composable
fun NavigationHost(navController: NavHostController) {
    NavHost(navController, startDestination = "home") {
        composable("home") { HomeScreen() }
        composable("profile") { ProfileScreen() }
        composable("settings") { SettingsScreen() } //Aqui poner la calculadora y el qr
    }
}