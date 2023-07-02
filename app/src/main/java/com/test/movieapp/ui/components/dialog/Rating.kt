package com.test.movieapp.ui.components.dialog

import androidx.compose.runtime.Composable
import com.test.movieapp.ui.model.dialog.DialogButton
import com.test.movieapp.ui.model.dialog.DialogContent
import com.test.movieapp.ui.model.dialog.DialogText
import com.test.movieapp.ui.model.dialog.DialogTitle

@Composable
fun DialogPopup.Rating(
    movieName: String,
    rating: Float,
    button: List<DialogButton>
) {
    BaseDialogPopup(
        dialogTitle = DialogTitle.Large("Rate your score!"),
        dialogContent = DialogContent.Rating(
            DialogText.Rating(
                text = movieName,
                rating = rating
            )
        ),
        button = button
    )
}