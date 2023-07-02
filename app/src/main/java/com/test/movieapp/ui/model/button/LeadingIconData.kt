package com.test.movieapp.ui.model.button

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class LeadingIconData(
    @DrawableRes val iconDrawable: Int,
    @StringRes val iconContentDescription: Int?
)