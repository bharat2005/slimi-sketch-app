package com.forsomeonespecial.slimisketchapp.feature.nutritioninsights.presentation.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.forsomeonespecial.slimisketchapp.feature.nutritioninsights.presentation.screen.screen1.NutrintionInsightsScreen1


fun NavGraphBuilder.nutritionInsightsNavGraph(navController: NavController){
    navigation<NutritionInsightsGraph>(
        startDestination = NutritionInsightsRoutes.NutritionInsightsScreen1Route
    ){
        composable<NutritionInsightsRoutes.NutritionInsightsScreen1Route> {
            NutrintionInsightsScreen1()
        }
    }
}