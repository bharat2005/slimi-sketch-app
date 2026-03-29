package com.forsomeonespecial.slimisketchapp.feature.nutritioninsights.presentation.navigation

import kotlinx.serialization.Serializable

@Serializable
object NutritionInsightsGraph

sealed class NutritionInsightsRoutes {
    @Serializable
    object NutritionInsightsScreen1Route : NutritionInsightsRoutes()
}