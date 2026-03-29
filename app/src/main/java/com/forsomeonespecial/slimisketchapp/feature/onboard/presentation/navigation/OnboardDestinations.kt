package com.forsomeonespecial.slimisketchapp.feature.onboard.presentation.navigation

import kotlinx.serialization.Serializable


@Serializable
object OnboardGraph

sealed class OnboardRoute {
    @Serializable
    object Screen1 : OnboardRoute()

}