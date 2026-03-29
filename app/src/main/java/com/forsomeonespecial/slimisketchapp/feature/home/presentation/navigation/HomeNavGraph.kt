package com.forsomeonespecial.slimisketchapp.feature.home.presentation.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.forsomeonespecial.slimisketchapp.feature.home.presentation.screen.home.HomeScreen

fun NavGraphBuilder.homeNavGraph(navController: NavController){
    navigation<HomeGraph>(
        startDestination = HomeRoutes.HomeScreen1Route
    ){

        composable<HomeRoutes.HomeScreen1Route>{
            HomeScreen()
        }


    }
}