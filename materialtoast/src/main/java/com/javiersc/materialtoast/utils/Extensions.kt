package com.javiersc.materialtoast.utils

import android.content.Context
import android.content.res.ColorStateList
import android.content.res.Resources
import android.util.DisplayMetrics
import android.util.TypedValue
import android.util.TypedValue.COMPLEX_UNIT_DIP
import androidx.core.content.ContextCompat


private val displayMetrics: DisplayMetrics = Resources.getSystem().displayMetrics

val Int.dp: Int
    get() = TypedValue.applyDimension(COMPLEX_UNIT_DIP, this.toFloat(), displayMetrics).toInt()
val Float.dp: Float
    get() = TypedValue.applyDimension(COMPLEX_UNIT_DIP, this, displayMetrics)

internal fun Context.color(colorId: Int) = ContextCompat.getColor(this, colorId)
internal val Int.colorStateList: ColorStateList
    get() = ColorStateList.valueOf(this)
