package com.javiersc.materialtoast.toasts

import android.content.Context
import android.graphics.drawable.Drawable
import android.os.Build.VERSION.SDK_INT
import android.os.Build.VERSION_CODES.LOLLIPOP
import android.widget.Toast
import androidx.annotation.CheckResult
import com.javiersc.materialtoast.R
import com.javiersc.materialtoast.utils.setupStatusToastView


class Status {

    companion object {

        @CheckResult(suggest = "show()")
        internal fun normal(ctx: Context, msg: CharSequence, ic: Drawable?, drtn: Int): Toast {
            val toast = Toast(ctx).apply { duration = drtn }
            val bgColor = if (SDK_INT >= LOLLIPOP) R.color.bg_normal else R.color.bg_normal_pre
            toast.view = ctx.setupStatusToastView(msg, R.color.normal, ic, R.color.normal, bgColor)
            return toast
        }

        internal fun success(ctx: Context, msg: CharSequence, ic: Drawable?, drtn: Int): Toast {
            val toast = Toast(ctx).apply { duration = drtn }
            toast.view = ctx.setupStatusToastView(msg, R.color.success, ic, R.color.success, R.color.bg_success)
            return toast
        }

        internal fun warning(ctx: Context, msg: CharSequence, ic: Drawable?, drtn: Int): Toast {
            val toast = Toast(ctx).apply { duration = drtn }
            toast.view = ctx.setupStatusToastView(msg, R.color.warning, ic, R.color.warning, R.color.bg_warning)
            return toast
        }

        internal fun error(ctx: Context, msg: CharSequence, ic: Drawable?, drtn: Int): Toast {
            val toast = Toast(ctx).apply { duration = drtn }
            toast.view = ctx.setupStatusToastView(msg, R.color.error, ic, R.color.error, R.color.bg_error)
            return toast
        }

    }

}

