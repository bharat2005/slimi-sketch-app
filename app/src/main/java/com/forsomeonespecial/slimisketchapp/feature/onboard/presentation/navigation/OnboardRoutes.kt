package com.forsomeonespecial.slimisketchapp.feature.onboard.presentation.navigation

import kotlinx.serialization.Serializable


@Serializable
object OnboardGraph

sealed class OnboardRoutes {
    @Serializable
    object OnboardScreen1Route : OnboardRoutes()

}