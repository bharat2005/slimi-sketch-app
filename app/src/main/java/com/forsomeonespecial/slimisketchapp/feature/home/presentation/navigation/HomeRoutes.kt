package com.forsomeonespecial.slimisketchapp.feature.home.presentation.navigation

import kotlinx.serialization.Serializable

@Serializable
object HomeGraph

sealed class HomeRoutes {
    @Serializable
    object HomeScreen1Route : HomeRoutes()
}