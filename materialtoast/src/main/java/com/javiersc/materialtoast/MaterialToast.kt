package com.javiersc.materialtoast

import android.content.Context
import android.graphics.drawable.Drawable
import com.javiersc.materialtoast.toasts.Status
import com.javiersc.materialtoast.toasts.Stylized
import com.javiersc.materialtoast.utils.LONG
import com.javiersc.materialtoast.utils.icError
import com.javiersc.materialtoast.utils.icSuccess

class MaterialToast {

    companion object {

        fun normal(context: Context, message: String, icon: Drawable? = null, duration: Int = LONG) =
            Status.normal(context, message, icon, duration)

        fun success(context: Context, message: String, icon: Drawable? = context.icSuccess, duration: Int = LONG) =
            Status.success(context, message, icon, duration)

        fun error(context: Context, message: String, icon: Drawable? = context.icError, duration: Int = LONG) =
            Status.error(context, message, icon, duration)

        fun stylized(context: Context, stylized: Stylized) = Stylized.stylized(context, stylized)

    }

}