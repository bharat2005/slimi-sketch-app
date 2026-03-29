package com.forsomeonespecial.slimisketchapp.feature.main.presentation.screen.main.component

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hasRoute
import androidx.navigation.NavDestination.Companion.hierarchy
import com.forsomeonespecial.slimisketchapp.feature.main.presentation.screen.main.MainTabDestination

@Composable
fun BottomNavBar(
    currentDestination : NavDestination?,
    destinations : List<MainTabDestination>,
    onTabClick : (MainTabDestination) -> Unit,
) {

    NavigationBar {
        destinations.forEach { destination ->
            val isSelected = currentDestination?.hierarchy?.any { it.hasRoute(destination.route::class) } == true

            NavigationBarItem(
                selected = isSelected,
                onClick = {onTabClick(destination)},
                icon = { Icon(destination.icon, contentDescription = destination.label) },
                label = { Text(destination.label) }
            )
        }
    }

}