package com.example.sheremetmycatneptune.ui.profile

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.sheremetmycatneptune.model.Neptune
import com.example.sheremetmycatneptune.ui.theme.MyCatNeptuneTheme
import com.example.sheremetmycatneptune.R




@Composable
fun CatProfile(
    neptune: Neptune,
    modifier: Modifier = Modifier,
) {
    Surface(modifier = modifier.fillMaxSize()) {
        LazyColumn() {
            item { ProfileHeader(avatar = neptune.photo) }
            item {
                Text(
                    text = neptune.name,
                    style = MaterialTheme.typography.displayLarge.copy(fontWeight = FontWeight.Medium),
                    modifier = modifier
                        .fillMaxWidth()
                        .padding(15.dp),
                    textAlign = TextAlign.Center
                )
            }
            item { Area("Breed", neptune.breed) }
            item { Area("Sex", neptune.sex) }
            item { Area("Age(month)", neptune.age.toString()) }
            item {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(15.dp)
                        .size(100.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Bottom,
                ) {
                    Button(onClick = {}) {
                        Text(
                            text = "Feed Me",
                            style = MaterialTheme.typography.headlineMedium.copy(fontWeight = FontWeight.Medium)
                        )
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun CatProfilePreview() {
    val neptune = Neptune(
        id = "1",
        name = "Serious Neptune",
        breed = "Scottish fold",
        sex = "male",
        age = "8 month",
        photo = R.drawable.nep1
    )
    MyCatNeptuneTheme(darkTheme = true) {
        CatProfile(neptune = neptune)
    }
}
