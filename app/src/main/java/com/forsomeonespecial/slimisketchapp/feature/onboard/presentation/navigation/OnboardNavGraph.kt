package com.forsomeonespecial.slimisketchapp.feature.onboard.presentation.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.forsomeonespecial.slimisketchapp.feature.onboard.presentation.screen.screen1.OnboardScreen1

fun NavGraphBuilder.onboardNavGraph(navController: NavController){
    navigation<OnboardGraph>(
        startDestination = OnboardRoutes.OnboardScreen1Route,
    ){
        composable<OnboardRoutes.OnboardScreen1Route> {
            OnboardScreen1()
        }
    }
}