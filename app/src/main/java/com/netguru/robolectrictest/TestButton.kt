package com.netguru.robolectrictest

import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag

@Composable
fun TestButton() {
    Button(onClick = {}, modifier = Modifier.testTag("test_button")) {
        Text(text = "Action")
    }
}
