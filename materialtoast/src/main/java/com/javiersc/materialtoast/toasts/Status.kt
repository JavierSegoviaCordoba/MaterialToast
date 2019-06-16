package com.javiersc.materialtoast.toasts

import android.content.Context
import android.graphics.drawable.Drawable
import android.widget.Toast
import com.javiersc.materialtoast.R
import com.javiersc.materialtoast.utils.setupStatusToastView


class Status {

    companion object {

        internal fun normal(ctx: Context, msg: CharSequence, ic: Drawable?, drtn: Int): Toast {
            val toast = Toast(ctx).apply { duration = drtn }
            toast.view = ctx.setupStatusToastView(msg, R.color.normal, ic, R.color.normal, R.color.bg_normal)
            return toast
        }

        internal fun success(ctx: Context, msg: CharSequence, ic: Drawable?, drtn: Int): Toast {
            val toast = Toast(ctx).apply { duration = drtn }
            toast.view = ctx.setupStatusToastView(msg, R.color.success, ic, R.color.success, R.color.bg_success)
            return toast
        }

        internal fun error(ctx: Context, msg: CharSequence, ic: Drawable?, drtn: Int): Toast {
            val toast = Toast(ctx).apply { duration = drtn }
            toast.view = ctx.setupStatusToastView(msg, R.color.error, ic, R.color.error, R.color.bg_error)
            return toast
        }

    }

}

