package com.forsomeonespecial.slimisketchapp.feature.main.presentation.screen.main

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.forsomeonespecial.slimisketchapp.feature.home.presentation.navigation.HomeGraph
import com.forsomeonespecial.slimisketchapp.feature.home.presentation.navigation.homeNavGraph
import com.forsomeonespecial.slimisketchapp.feature.main.presentation.navigation.MainTabDestination
import com.forsomeonespecial.slimisketchapp.feature.main.presentation.navigation.ProfileGraph
import com.forsomeonespecial.slimisketchapp.feature.main.presentation.navigation.SearchGraph
import com.forsomeonespecial.slimisketchapp.feature.main.presentation.screen.main.component.BottomTabBar

@Composable
fun MainScreen(
    rootNavController : NavController
) {
    val tabNavController = rememberNavController()

    Scaffold(
        bottomBar = {
            BottomTabBar(tabNavController, MainTabDestination.destinations)
        }
    ) { _ ->
        NavHost(
            navController = tabNavController,
            startDestination = HomeGraph
        ){

            homeNavGraph(tabNavController)


            //these are just for experiments
            composable<SearchGraph>{
                Box(modifier = Modifier.fillMaxSize().padding())
            }

            composable<ProfileGraph>{
                Box(modifier = Modifier.fillMaxSize().padding())
            }

        }

    }


}