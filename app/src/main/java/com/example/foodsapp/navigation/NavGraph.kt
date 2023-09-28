package com.example.foodsapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.foodsapp.entity.Yemekler
import com.example.Anasayfa
import com.example.foodsapp.screens.AnimatedSplashScreen
import com.example.foodsapp.screens.DetaySayfa
import com.google.gson.Gson

@Composable
fun SayfaGecisleri() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Screen.Splash.route
    ) {
        composable(route = Screen.Splash.route) {
            AnimatedSplashScreen(navController = navController)
        }
        composable(Screen.Home.route) {
            Anasayfa(navController = navController)
        }
        composable("detay_sayfa/{yemek}", arguments = listOf(
            navArgument("yemek") { type = NavType.StringType }
        )) {
            val json = it.arguments?.getString("yemek")
            val yemek = Gson().fromJson(json, Yemekler::class.java)
            DetaySayfa(yemek = yemek)
        }

    }
}