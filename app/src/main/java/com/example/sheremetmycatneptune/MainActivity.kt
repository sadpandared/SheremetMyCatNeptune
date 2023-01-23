package com.example.sheremetmycatneptune

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.BackHandler
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.animation.Crossfade
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.sheremetmycatneptune.model.NeptuneModel
import com.example.sheremetmycatneptune.ui.catalog.Catalog
import com.example.sheremetmycatneptune.ui.profile.CatProfile
import com.example.sheremetmycatneptune.ui.theme.MyCatNeptuneTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val viewModel: NeptuneModel by viewModels()
        setContent {
            MyCatNeptuneTheme(darkTheme = true) {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainScreen(viewModel)
                }
            }
        }
    }
}

@Composable
fun MainScreen(viewModel: NeptuneModel) {
    val state by viewModel.cats.collectAsState()
    var selectedId by remember {
        mutableStateOf<String?>(value = null)
    }
    Crossfade(targetState = selectedId) { id ->
        if (id == null) {
            Catalog(neptunes = state, onSelected = { cat ->
                selectedId = cat.id
            })
        } else {
            CatProfile(neptune = viewModel.getById(id))
            BackHandler() {
                selectedId = null
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyCatNeptuneTheme(darkTheme = true) {
        MainScreen(NeptuneModel())
    }
}