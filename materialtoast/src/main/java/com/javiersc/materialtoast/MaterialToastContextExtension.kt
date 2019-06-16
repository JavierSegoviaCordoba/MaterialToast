package com.javiersc.materialtoast

import android.content.Context
import android.graphics.drawable.Drawable
import com.javiersc.materialtoast.toasts.Status
import com.javiersc.materialtoast.toasts.Stylized
import com.javiersc.materialtoast.utils.LONG
import com.javiersc.materialtoast.utils.icError
import com.javiersc.materialtoast.utils.icSuccess

fun Context.normal(message: String, icon: Drawable? = null, duration: Int = LONG) =
    Status.normal(this, message, icon, duration)

fun Context.success(message: String, icon: Drawable? = this.icSuccess, duration: Int = LONG) =
    Status.success(this, message, icon, duration)

fun Context.error(message: String, icon: Drawable? = this.icError, duration: Int = LONG) =
    Status.error(this, message, icon, duration)

fun Context.stylized(stylized: Stylized) = Stylized.stylized(this, stylized)
