package com.test.movieapp.ui.components.dialog

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.test.movieapp.ui.model.button.LeadingIconData
import com.test.movieapp.ui.model.dialog.DialogButton
import com.test.movieapp.R
import com.test.movieapp.ui.theme.MovieAppTheme

@Preview
@Composable
fun AlertPreview() {
    MovieAppTheme() {
        DialogPopup.Alert(
            title = "Title",
            bodyText = "abced abced abced abced abced",
            button = listOf(
                DialogButton.UnderlinedText("CLOSE")
            )
        )
    }
}

@Preview
@Composable
fun DefaultPreview() {
    MovieAppTheme() {
        DialogPopup.Default(
            title = "Title",
            bodyText = "abced abced abced abced abced",
            button = listOf(
                DialogButton.Primary("OPEN"),
                DialogButton.Secondary("CLOSE")
            )
        )
    }
}

@Preview
@Composable
fun RatingPreview() {
    MovieAppTheme() {
        DialogPopup.Rating(
            movieName = "Movie Name",
            rating = 3.5f,
            button = listOf(
                DialogButton.Primary(
                    title = "OPEN",
                    leadingIconData = LeadingIconData(
                        iconDrawable = R.drawable.baseline_star_rate_24,
                        iconContentDescription = null
                    )
                ),
                DialogButton.SecondaryBorderless("CLOSE")
            )
        )
    }
}