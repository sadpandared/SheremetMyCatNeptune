package com.example.sheremetmycatneptune.ui.profile

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.sheremetmycatneptune.R
import com.example.sheremetmycatneptune.ui.theme.MyCatNeptuneTheme


@Composable
fun ProfileHeader(avatar: Int) {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .height(250.dp),
    )
    {
        Image(
            alignment = Alignment.TopCenter,
            contentDescription = "Avatar",
            contentScale = ContentScale.Crop,
            painter = painterResource(id = avatar),
        )
    }
}

@Preview
@Composable
fun ProfileHeaderPreview() {
    MyCatNeptuneTheme(darkTheme = true) {
        ProfileHeader(avatar = R.drawable.nep4)
    }
}