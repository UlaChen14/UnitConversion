package com.yitianyitiandan.unitconversion

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

enum class UnitType(@DrawableRes val icon: Int, @StringRes val text: Int) {
    HEIGHT(R.drawable.ic_ruler, R.string.text_height),
    WEIGHT(R.drawable.ic_weight, R.string.text_weight),
    TIME_ZONE(R.drawable.ic_calendar, R.string.text_time_zone),
}