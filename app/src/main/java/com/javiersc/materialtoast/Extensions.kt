package com.javiersc.materialtoast

import android.content.res.Resources
import android.util.DisplayMetrics
import android.util.TypedValue

private val displayMetrics: DisplayMetrics = Resources.getSystem().displayMetrics

fun Int.dp(): Float = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, this.toFloat(), displayMetrics)
fun Float.dp(): Float = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, this, displayMetrics)