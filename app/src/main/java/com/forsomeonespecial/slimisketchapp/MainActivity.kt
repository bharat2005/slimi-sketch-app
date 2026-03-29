package com.forsomeonespecial.slimisketchapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.forsomeonespecial.slimisketchapp.app.AppRoot
import com.forsomeonespecial.slimisketchapp.core.ui.theme.SlimiSketchAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppRoot()
        }
    }
}

