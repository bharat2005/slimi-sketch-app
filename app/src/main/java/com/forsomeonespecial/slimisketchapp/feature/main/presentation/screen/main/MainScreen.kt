package com.forsomeonespecial.slimisketchapp.feature.main.presentation.screen.main

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.NavController
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.forsomeonespecial.slimisketchapp.feature.home.presentation.navigation.HomeGraph
import com.forsomeonespecial.slimisketchapp.feature.home.presentation.navigation.homeNavGraph
import com.forsomeonespecial.slimisketchapp.feature.main.presentation.screen.main.component.BottomNavBar

@Composable
fun MainScreen(
    rootNavController : NavController
) {
    val tabNavController = rememberNavController()
    val backstackEntry = tabNavController.currentBackStackEntryAsState()
    val currentDestination = backstackEntry.value?.destination



    Scaffold(
        bottomBar = {
            BottomNavBar(
                currentDestination = currentDestination,
                destinations = MainTabDestination.destinations,
                onTabClick = { destination ->
                    tabNavController.navigate(destination.route) {
                        popUpTo(tabNavController.graph.findStartDestination().id) {
                            saveState = true
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                }
            )
        }
    ) { _ ->
        NavHost(
            navController = tabNavController,
            startDestination = HomeGraph
        ){

            homeNavGraph(tabNavController)


        }

    }


}

sealed class MainTabDestination(
    val route : Any,
    val icon : ImageVector,
    val label : String
) {
    companion object {
        val destinations = listOf(
            HomeTab,
        )
    }

    object HomeTab : MainTabDestination(
        route = HomeGraph,
        icon = Icons.Default.Home,
        label = "Home"
    )


}


