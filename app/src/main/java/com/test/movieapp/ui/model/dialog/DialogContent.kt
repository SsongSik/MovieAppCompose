package com.test.movieapp.ui.model.dialog

sealed class DialogContent {
    //글자 작은 버전
    data class Default(
        val dialogText: DialogText.Default
    ) : DialogContent()

    //글자 큰 버전
    data class Large(
        val dialogText: DialogText.Default
    ) : DialogContent()

    data class Rating(
        val dialogText: DialogText.Rating
    ) : DialogContent()
}
