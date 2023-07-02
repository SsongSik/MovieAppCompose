package com.test.movieapp.ui.components.dialog

import androidx.compose.runtime.Composable
import com.test.movieapp.ui.model.dialog.DialogButton
import com.test.movieapp.ui.model.dialog.DialogContent
import com.test.movieapp.ui.model.dialog.DialogText
import com.test.movieapp.ui.model.dialog.DialogTitle


@Composable
fun DialogPopup.Default(
    title: String,
    bodyText: String,
    button: List<DialogButton>
) {
    BaseDialogPopup(
        dialogTitle = DialogTitle.Default(title),
        dialogContent = DialogContent.Default(
            DialogText.Default(bodyText)
        ),
        button = button
    )
}