package com.test.movieapp.ui.components.dialog.conponents.button

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.test.movieapp.ui.model.dialog.DialogButton
import com.test.movieapp.ui.components.button.PrimaryButton
import com.test.movieapp.ui.components.button.SecondaryBorderButton
import com.test.movieapp.ui.components.button.SecondaryButton
import com.test.movieapp.ui.components.button.UnderlinedButton
import com.test.movieapp.ui.theme.Paddings


@Composable
fun DialogButtonColumn(
    buttons: List<DialogButton>?
) {
    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        buttons?.forEachIndexed { index, dialogButton ->
            if (index > 0) {
                Spacer(modifier = Modifier.height(Paddings.large))
            }
            when (dialogButton) {
                is DialogButton.Primary -> {
                    PrimaryButton(
                        text = dialogButton.title,
                        leadingIconData = dialogButton.leadingIconData
                    ) {
                        dialogButton.action?.invoke()
                    }
                }

                is DialogButton.Secondary -> {
                    SecondaryBorderButton(
                        text = dialogButton.title
                    ) {
                        dialogButton.action?.invoke()
                    }
                }

                is DialogButton.SecondaryBorderless -> {
                    SecondaryButton(
                        text = dialogButton.title
                    ) {
                        dialogButton.action?.invoke()
                    }
                }

                is DialogButton.UnderlinedText -> {
                    UnderlinedButton(
                        text = dialogButton.title
                    ) {
                        dialogButton.action?.invoke()
                    }
                }
            }
        }
        Spacer(modifier = Modifier.height(Paddings.large))
    }
}