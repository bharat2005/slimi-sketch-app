package com.forsomeonespecial.slimisketchapp.feature.home.presentation.navigation

import kotlinx.serialization.Serializable

@Serializable
object HomeGraph

sealed class HomeRoute {
    @Serializable
    object Home : HomeRoute()
}