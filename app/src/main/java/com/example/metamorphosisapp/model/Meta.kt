package com.example.metamorphosisapp.model

import androidx.annotation.DrawableRes

data class Meta(
    @DrawableRes val imageResourceId: Int,
    val name: String,
    val desc: String
)