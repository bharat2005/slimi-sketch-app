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
                startDestination = OnboardGraph
            ){
                onboardNavGraph(rootNavController)

            }

        }

    }
}