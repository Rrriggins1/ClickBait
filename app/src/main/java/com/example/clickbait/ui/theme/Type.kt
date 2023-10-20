package com.example.clickbait.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.clickbait.R

val Coustard = FontFamily(
    Font(R.font.coustard_regular)
)

val GowunBatang = FontFamily(
    Font(R.font.gowunbatang_regular)
)
// Set of Material typography styles to start with
val Typography = Typography(
    labelLarge = TextStyle(
        fontFamily = Coustard,
        fontWeight = FontWeight.Bold,
        fontSize = 12.sp,
    ),
    labelMedium = TextStyle(
        fontFamily = GowunBatang,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
    ),
    bodyMedium = TextStyle(
        fontFamily = GowunBatang,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
    )
)

