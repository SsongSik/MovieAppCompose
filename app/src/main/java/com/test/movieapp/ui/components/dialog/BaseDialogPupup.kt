package com.test.movieapp.ui.components.dialog

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.test.movieapp.ui.model.dialog.DialogButton
import com.test.movieapp.ui.model.dialog.DialogContent
import com.test.movieapp.ui.model.dialog.DialogText
import com.test.movieapp.ui.model.dialog.DialogTitle
import com.test.movieapp.ui.components.dialog.conponents.button.DialogButtonColumn
import com.test.movieapp.ui.components.dialog.conponents.content.DialogContentWrapper
import com.test.movieapp.ui.components.dialog.conponents.title.DialogTitleWrapper
import com.test.movieapp.ui.theme.MovieAppTheme
import com.test.movieapp.ui.theme.Paddings
import com.test.movieapp.ui.theme.colorsScheme


@Composable
fun BaseDialogPopup(
    dialogTitle: DialogTitle? = null,
    dialogContent: DialogContent? = null,
    button: List<DialogButton>? = null
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        elevation = Paddings.none,
        backgroundColor = MaterialTheme.colorsScheme.background,
        shape = MaterialTheme.shapes.large
    ) {
        Column(
            modifier = Modifier.fillMaxWidth()
        ) {
            dialogTitle?.let {
                DialogTitleWrapper(it)
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Transparent)
                    .padding(
                        start = Paddings.xlarge,
                        end = Paddings.xlarge,
                        top = Paddings.xlarge,
                    )
            ) {
                dialogContent?.let {
                    DialogContentWrapper(it)
                }
                button?.let {
                    DialogButtonColumn(it)
                }
            }
        }
    }
}

@Preview
@Composable
fun BaseDialogPopupPreView() {
    MovieAppTheme() {
        BaseDialogPopup(
            dialogTitle = DialogTitle.Header("Title"),
            dialogContent = DialogContent.Large(
                DialogText.Default("abced abced abced abced abced abced abced")
            ),
            button = listOf(
                DialogButton.Primary("Ok")
            )
        )
    }
}

@Preview
@Composable
fun BaseDialogLargePopupPreView() {
    MovieAppTheme() {
        BaseDialogPopup(
            dialogTitle = DialogTitle.Large("Title"),
            dialogContent = DialogContent.Large(
                DialogText.Default("abced abced abced abced abced abced abced")
            ),
            button = listOf(
                DialogButton.Secondary("Okay"),
                DialogButton.UnderlinedText("Cancel"),
            )
        )
    }
}

@Preview
@Composable
fun BaseDialogRatingPopupPreView() {
    MovieAppTheme() {
        BaseDialogPopup(
            dialogTitle = DialogTitle.Large("Title"),
            dialogContent = DialogContent.Rating(
                DialogText.Rating(
                    text = "범죄도시3",
                    rating = 8.2f
                )
            ),
            button = listOf(
                DialogButton.Primary("Okay"),
                DialogButton.Secondary("Cancel"),
            )
        )
    }
}