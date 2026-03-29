package com.forsomeonespecial.slimisketchapp.feature.main.presentation.screen.main.component

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavDestination.Companion.hasRoute
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.currentBackStackEntryAsState
import com.forsomeonespecial.slimisketchapp.feature.main.presentation.navigation.MainTabDestination

@Composable
fun BottomTabBar(
    tabNavController : NavController,
    destinations : List<MainTabDestination>
) {
    val currentDestination = tabNavController.currentBackStackEntryAsState().value?.destination

    NavigationBar {
        destinations.forEach { destination ->
            val isSelected = currentDestination?.hierarchy?.any { it.hasRoute(destination.route::class) } == true

            NavigationBarItem(
                selected = isSelected,
                onClick = {
                    tabNavController.navigate(destination.route){
                        popUpTo(tabNavController.graph.findStartDestination().id){
                            saveState = true
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                },
                icon = { Icon(destination.icon, contentDescription = destination.label) },
                label = { Text(destination.label) }
            )
        }
    }

}