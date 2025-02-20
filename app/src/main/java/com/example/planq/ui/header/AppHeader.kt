package com.example.planq.ui.header

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import com.example.planq.R

@Composable
fun AppHeader() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(52.dp)
            .background(Color.White)
            .padding(top = 4.dp, end = 4.dp, bottom = 4.dp, start = 12.dp),
        contentAlignment = Alignment.Center
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            Image(
                painter = rememberAsyncImagePainter(stringResource(R.string.ic_logo)),
                contentDescription = "ic_logo",
                modifier = Modifier
                    .width(100.dp)
                    .height(26.5.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.ic_bell),
                contentDescription = "ic_bell",
                modifier = Modifier
                    .size(28.dp),
            )
        }
    }
}

@Preview
@Composable
fun AppHeaderPreview() {
    AppHeader()
}