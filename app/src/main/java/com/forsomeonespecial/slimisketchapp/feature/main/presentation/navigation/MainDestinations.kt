package com.forsomeonespecial.slimisketchapp.feature.main.presentation.navigation

import android.media.Image
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.SearchBar
import androidx.compose.ui.graphics.vector.ImageVector
import com.forsomeonespecial.slimisketchapp.feature.home.presentation.navigation.HomeGraph
import kotlinx.serialization.Serializable
import kotlin.reflect.KClass


@Serializable
object MainGraph

sealed class MainRoute{
    @Serializable
    object Main : MainRoute()
}






