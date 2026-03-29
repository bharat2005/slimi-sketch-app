package com.forsomeonespecial.slimisketchapp.feature.main.presentation.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.forsomeonespecial.slimisketchapp.feature.main.presentation.screen.main.MainScreen


fun NavGraphBuilder.mainNavGraph(navController: NavController){
    navigation<MainGraph>(
        startDestination = MainRoute.Main
    ) {
        composable<MainRoute.Main> {
            MainScreen(navController)
        }
    }

}