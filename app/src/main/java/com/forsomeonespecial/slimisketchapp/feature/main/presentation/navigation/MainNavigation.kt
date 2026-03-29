package com.forsomeonespecial.slimisketchapp.feature.main.presentation.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.forsomeonespecial.slimisketchapp.feature.main.presentation.screen.main.MainScreen


fun NavGraphBuilder.mainNavGraph(navController: NavController){

        composable<MainGraph>{
            MainScreen(
                navController
            )
        }


}