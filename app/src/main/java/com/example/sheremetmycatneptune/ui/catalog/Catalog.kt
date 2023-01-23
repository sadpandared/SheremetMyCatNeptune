package com.example.sheremetmycatneptune.ui.catalog

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.sheremetmycatneptune.R
import com.example.sheremetmycatneptune.model.Neptune
import com.example.sheremetmycatneptune.ui.cat.FoxCard
import com.example.sheremetmycatneptune.ui.theme.MyCatNeptuneTheme


@Composable
fun Catalog(
    neptunes: List<Neptune>,
    onSelected: (Neptune) -> Unit,
    modifier: Modifier = Modifier
) {
    Surface(modifier = modifier.fillMaxSize()) {
        LazyColumn() {
            items(neptunes) { fox ->
                FoxCard(neptune = fox, onClick = { onSelected(fox) })
            }
        }
    }
}

@Preview
@Composable
fun CatalogPreview() {
    val neptune = Neptune(
        id = "1",
        name = "Serious Neptune",
        breed = "Scottish fold",
        sex = "male",
        age = "8 month",
        photo = R.drawable.nep1
    )
    MyCatNeptuneTheme(darkTheme = true) {
        Catalog(neptunes = listOf(neptune), onSelected = {})
    }
}