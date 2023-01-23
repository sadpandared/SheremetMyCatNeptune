package com.example.sheremetmycatneptune.ui.profile

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.sheremetmycatneptune.R
import com.example.sheremetmycatneptune.model.Neptune
import com.example.sheremetmycatneptune.ui.theme.MyCatNeptuneTheme


@Composable
fun Area(
    areaName: String,
    areaValue: String,
    modifier: Modifier = Modifier
) {
    Surface(modifier = modifier.fillMaxWidth()) {
        val padding = 20.dp
        Column(
            modifier
                .fillMaxWidth()
                .padding(
                    top = padding / 2,
                    start = padding,
                    end = padding,
                    bottom = padding / 2
                )
        ) {
            Text(
                text = areaName,
                style = MaterialTheme.typography.headlineSmall.copy(fontWeight = FontWeight.Light)
            )
            Text(
                text = areaValue,
                style = MaterialTheme.typography.headlineMedium.copy(fontWeight = FontWeight.SemiBold)
            )
            Divider(
                color = Color.LightGray,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        start = 1.dp,
                        end = 5.dp,
                        top = 1.dp,
                        bottom = 3.dp
                    )
            )
        }
    }
}

@Preview
@Composable
fun FieldPreview() {
    val neptune = Neptune(
        id = "1",
        name = "Serious Neptune",
        breed = "Scottish fold",
        sex = "male",
        age = "8 month",
        photo = R.drawable.nep1
    )

    MyCatNeptuneTheme(darkTheme = true) {
        Surface {
            Area("Age(month)", neptune.age.toString())

        }
    }
}