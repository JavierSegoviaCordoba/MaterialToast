package com.javiersc.materialtoast.toasts

import android.content.Context
import android.graphics.Typeface
import android.graphics.drawable.Drawable
import android.widget.Toast
import androidx.core.graphics.toColorInt
import com.javiersc.materialtoast.utils.ToastShape
import com.javiersc.materialtoast.utils.colorStateList
import com.javiersc.materialtoast.utils.dp
import com.javiersc.materialtoast.utils.toastView
import kotlinx.android.synthetic.main.material_toast.view.*

class Stylized {

    var message: String = ""
    var messageColor: Int = "#000000".toColorInt()
    var typeface: Typeface = Typeface.DEFAULT

    var icon: Drawable? = null
    var iconTint: Int = "#000000".toColorInt()

    var backgroundColor: Int = "#DFFFFFFF".toColorInt()
    var elevation: Float = 0f
    var strokeColor: Int = "#DFFFFFFF".toColorInt()
    var strokeWidth: Int = 0
    var radius: Float = 16f.dp()
    var offsetY: Float = 6f.dp()
    var shape: ToastShape = ToastShape.ROUNDED

    var duration: Int = Toast.LENGTH_LONG

    companion object {

        internal fun stylized(ctx: Context, stylized: Stylized): Toast {
            val toast = Toast(ctx).apply { duration = stylized.duration }
            toast.view = ctx.toastView.apply {
                materialButton.apply {
                    text = stylized.message
                    setTextColor(stylized.messageColor)
                    typeface = stylized.typeface

                    icon = stylized.icon
                    iconTint = stylized.iconTint.colorStateList()

                    backgroundTintList = stylized.backgroundColor.colorStateList()
                    elevation = stylized.elevation
                    strokeColor = stylized.strokeColor.colorStateList()
                    strokeWidth = stylized.strokeWidth
                    translationY = stylized.offsetY

                    shapeAppearanceModel = stylized.shape.setupShape(stylized)
                }
            }
            return toast
        }

    }

}