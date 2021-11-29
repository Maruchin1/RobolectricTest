package com.netguru.robolectrictest

import androidx.compose.ui.test.assertTextEquals
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Test
import org.junit.Rule
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ExampleUnitTest {

    @get:Rule
    val testRule = createComposeRule()

    @Test
    fun startCompose() {
        testRule.setContent {
            TestButton()
        }

        testRule.onNodeWithTag("test_button").assertTextEquals("Action")
    }
}
