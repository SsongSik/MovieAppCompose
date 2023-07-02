package com.test.movieapp.ui.theme

import androidx.compose.material.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.sp

/*
필요할 경우 사용
 */
//private val spoqaBold = FontFamily(
//    Font(R.font.spoqa_han_sans_neo_bold, FontWeight.Bold)
//)
//private val spoqaRegular = FontFamily(
//    Font(R.font.spoqa_han_sans_neo_regular, FontWeight.Normal)
//)
//private val spoqaThin = FontFamily(
//    Font(R.font.spoqa_han_sans_neo_thin, FontWeight.Thin)
//)

val Typography = Typography(
    defaultFontFamily = FontFamily.Default,
    h1 = TextStyle(
        fontFamily = FontFamily.Default,
        fontSize = 60.sp,
    ),
    h2 = TextStyle(
        fontFamily = FontFamily.Monospace,
        fontSize = 32.sp,
    ),
    h3 = TextStyle(
        fontFamily = FontFamily.Default,
        fontSize = 24.sp
    ),
    h4 = TextStyle(
        fontFamily = FontFamily.Default,
        fontSize = 32.sp
    ),
    h5 = TextStyle(
        fontFamily = FontFamily.Default,
        fontSize = 18.sp
    ),
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontSize = 18.sp,
    ),
    h6 = TextStyle(
        fontFamily = FontFamily.Monospace,
        fontSize = 15.sp
    ),
    subtitle1 = TextStyle(
        fontFamily = FontFamily.Monospace,
        fontSize = 18.sp,
    ),
    subtitle2 = TextStyle(
        fontFamily = FontFamily.Monospace,
        fontSize = 14.sp
    ),
    body1 = TextStyle(
        fontFamily = FontFamily.Default,
        fontSize = 15.sp
    ),
    body2 = TextStyle(
        fontFamily = FontFamily.Monospace,
        fontSize = 15.sp,
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Monospace,
        fontSize = 14.sp
    )
)

val Typography.h5Title: TextStyle
    @Composable get() = h5.copy(
        fontSize = 24.sp
    )

val Typography.dialogButton: TextStyle
    @Composable get() = button.copy(
        fontSize = 18.sp
    )

val Typography.underlinedDialogButton: TextStyle
    @Composable get() = button.copy(
        textDecoration = TextDecoration.Underline
    )

val Typography.underlinedButton: TextStyle
    @Composable get() = button.copy(
        textDecoration = TextDecoration.Underline
    )