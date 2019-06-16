package com.javiersc.materialtoast

import android.content.Context
import android.graphics.drawable.Drawable
import android.widget.Toast
import android.widget.Toast.LENGTH_LONG
import androidx.annotation.CheckResult
import com.javiersc.materialtoast.toasts.Status
import com.javiersc.materialtoast.toasts.Stylized
import com.javiersc.materialtoast.utils.icError
import com.javiersc.materialtoast.utils.icSuccess
import com.javiersc.materialtoast.utils.icWarning


class MaterialToast {

    companion object {

        @CheckResult(suggest = "show")
        fun normal(context: Context, message: String, icon: Drawable? = null, duration: Int = LENGTH_LONG): Toast =
            Status.normal(context, message, icon, duration)

        @CheckResult(suggest = "show")
        fun success(
            context: Context,
            message: String,
            icon: Drawable? = context.icSuccess,
            duration: Int = LENGTH_LONG
        ): Toast = Status.success(context, message, icon, duration)

        @CheckResult(suggest = "show")
        fun warning(
            context: Context,
            message: String,
            icon: Drawable? = context.icWarning,
            duration: Int = LENGTH_LONG
        ): Toast = Status.warning(context, message, icon, duration)

        @CheckResult(suggest = "show")
        fun error(
            context: Context,
            message: String,
            icon: Drawable? = context.icError,
            duration: Int = LENGTH_LONG
        ): Toast = Status.error(context, message, icon, duration)

        @CheckResult(suggest = "show")
        fun stylized(context: Context, stylized: Stylized): Toast = Stylized.stylized(context, stylized)

    }

}