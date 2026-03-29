package com.forsomeonespecial.slimisketchapp.feature.main.presentation.navigation

import kotlinx.serialization.Serializable


@Serializable
object MainGraph

sealed class MainRoutes{
    @Serializable
    object MainRoute : MainRoutes()
}






