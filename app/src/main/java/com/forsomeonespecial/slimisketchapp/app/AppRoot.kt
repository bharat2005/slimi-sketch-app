package com.forsomeonespecial.slimisketchapp.app

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.forsomeonespecial.slimisketchapp.core.ui.theme.SlimiSketchAppTheme
import com.forsomeonespecial.slimisketchapp.feature.main.presentation.navigation.MainGraph
import com.forsomeonespecial.slimisketchapp.feature.main.presentation.navigation.mainNavGraph
import com.forsomeonespecial.slimisketchapp.feature.nutritioninsights.presentation.navigation.nutritionInsightsNavGraph
import com.forsomeonespecial.slimisketchapp.feature.onboard.presentation.navigation.OnboardGraph
import com.forsomeonespecial.slimisketchapp.feature.onboard.presentation.navigation.onboardNavGraph

@Composable
fun AppRoot(
    viewModel: AppRootViewModel = hiltViewModel()
) {
    val rootNavController = rememberNavController()

    SlimiSketchAppTheme {

        Scaffold { _ ->
            NavHost(
                navController = rootNavController,
                startDestination = MainGraph
            ){
                onboardNavGraph(rootNavController)

                mainNavGraph(rootNavController)

                nutritionInsightsNavGraph(rootNavController)

            }

        }

    }
}