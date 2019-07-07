package com.javiersc.materialtoast.toasts

import android.content.Context
import android.graphics.Typeface
import android.graphics.drawable.Drawable
import android.os.Build.VERSION.SDK_INT
import android.os.Build.VERSION_CODES.LOLLIPOP
import android.widget.Toast
import androidx.core.graphics.toColorInt
import com.javiersc.materialtoast.utils.*
import kotlinx.android.synthetic.main.material_toast.view.*

class Stylized(internal val body: Stylized.() -> Unit) {

    var message: String = ""
    var messageColor: Int = "#000000".toColorInt()
    var messageSize: Float = 14f.sp
    var typeface: Typeface = Typeface.DEFAULT

    var icon: Drawable? = null
    var iconTint: Int = "#000000".toColorInt()

    var backgroundColor: Int = if (SDK_INT >= LOLLIPOP) "#99FFFFFF".toColorInt() else "#DFFFFFFF".toColorInt()
    var elevation: Float = 0f
    var strokeColor: Int = if (SDK_INT >= LOLLIPOP) "#99FFFFFF".toColorInt() else "#DFFFFFFF".toColorInt()
    var strokeWidth: Int = 0
    var radius: Float = 16f.dp
    var offsetY: Float = 6f.dp
    var shape: ToastShape = ToastShape.ROUNDED

    var duration: Int = Toast.LENGTH_LONG

    companion object {

        internal fun stylized(ctx: Context, stylized: Stylized): Toast {
            stylized.body(stylized)
            val toast = Toast(ctx).apply { duration = stylized.duration }
            toast.view = ctx.toastView.apply {
                materialButton.apply {
                    text = stylized.message
                    setTextColor(stylized.messageColor)
                    textSize = stylized.messageSize
                    typeface = stylized.typeface

                    icon = stylized.icon
                    iconTint = stylized.iconTint.colorStateList

                    backgroundTintList = stylized.backgroundColor.colorStateList
                    if (SDK_INT >= LOLLIPOP) elevation = stylized.elevation
                    strokeColor = stylized.strokeColor.colorStateList
                    strokeWidth = stylized.strokeWidth
                    translationY = stylized.offsetY

                    shapeAppearanceModel = stylized.shape.setupShape(stylized)
                }
            }
            return toast
        }

    }

}

