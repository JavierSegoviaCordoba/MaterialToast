package com.javiersc.materialtoast.utils

import android.content.Context
import android.content.res.ColorStateList
import android.content.res.Resources
import android.graphics.drawable.Drawable
import android.util.DisplayMetrics
import android.util.TypedValue
import android.util.TypedValue.COMPLEX_UNIT_DIP
import android.view.View
import android.widget.ImageView
import androidx.core.content.ContextCompat


private val displayMetrics: DisplayMetrics = Resources.getSystem().displayMetrics


internal fun View.visible() = with(this) { if (visibility != View.VISIBLE) visibility = View.VISIBLE }
internal fun View.gone() = with(this) { if (visibility != View.GONE) visibility = View.GONE }
internal fun Context.color(colorId: Int) = ContextCompat.getColor(this, colorId)
fun Int.dp(): Int = TypedValue.applyDimension(COMPLEX_UNIT_DIP, this.toFloat(), displayMetrics).toInt()
fun Float.dp(): Float = TypedValue.applyDimension(COMPLEX_UNIT_DIP, this, displayMetrics)


internal fun Int.colorStateList() = ColorStateList.valueOf(this)
internal var ImageView.icon: Drawable?
    get() = this.drawable
    set(value) = with(this) { value?.let { setImageDrawable(it).also { visible() } } ?: gone() }
