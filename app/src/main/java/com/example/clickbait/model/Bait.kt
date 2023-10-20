package com.example.clickbait.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Bait(
    @DrawableRes val image: Int,
    @StringRes val source: Int,
    @StringRes val desc: Int,
    @StringRes val time: Int,
)
