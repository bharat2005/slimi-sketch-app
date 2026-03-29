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


sealed class MainTabDestination(
    val route : Any,
    val icon : ImageVector,
    val label : String
) {
    companion object {
        val destinations = listOf(
            HomeTab,
            SearchTab,
            ProfileTab
        )
    }

    object HomeTab : MainTabDestination(
        route = HomeGraph,
        icon = Icons.Default.Home,
        label = "Home"
    )

    object SearchTab : MainTabDestination(
        route = SearchGraph,
        icon = Icons.Default.Search,
        label = "Search"
    )


    object ProfileTab : MainTabDestination(
        route = ProfileGraph,
        icon = Icons.Default.Person,
        label = "Profile"
    )

}






@Serializable
object SearchGraph

@Serializable
object ProfileGraph



