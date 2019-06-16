package com.javiersc.materialtoast.utils

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import com.javiersc.materialtoast.R
import kotlinx.android.synthetic.main.material_toast.view.*

internal val Context.toastView: View
    @SuppressLint("InflateParams")
    get() = (this.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater)
        .inflate(R.layout.material_toast, null)

internal fun Context.setupStatusToastView(
    msg: CharSequence,
    msgColorId: Int,
    ic: Drawable?,
    icTintId: Int,
    bgColorId: Int
): View {
    return toastView.apply {
        materialButton.apply {
            text = msg
            setTextColor(color(msgColorId))
            icon = ic
            iconTint = color(icTintId).colorStateList()
            backgroundTintList = context.color(bgColorId).colorStateList()
        }
    }
}

internal fun Context.setupSnackbarToastView(
    msg: CharSequence,
    msgColorId: Int,
    ic: Drawable?,
    icTintId: Int,
    bgColorId: Int
): View {
    return toastView.apply {
        materialButton.apply {
            text = msg
            setTextColor(color(msgColorId))
            icon = ic
            iconTint = color(icTintId).colorStateList()
            cornerRadius = 0
            backgroundTintList = context.color(bgColorId).colorStateList()
        }
    }
}