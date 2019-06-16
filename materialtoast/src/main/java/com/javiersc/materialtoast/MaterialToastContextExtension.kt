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

@CheckResult(suggest = "show")
fun Context.normal(message: String, icon: Drawable? = null, duration: Int = LENGTH_LONG): Toast =
    Status.normal(this, message, icon, duration)

@CheckResult(suggest = "show")
fun Context.success(message: String, icon: Drawable? = this.icSuccess, duration: Int = LENGTH_LONG): Toast =
    Status.success(this, message, icon, duration)

@CheckResult(suggest = "show")
fun Context.warning(message: String, icon: Drawable? = this.icWarning, duration: Int = LENGTH_LONG): Toast =
    Status.warning(this, message, icon, duration)

@CheckResult(suggest = "show")
fun Context.error(message: String, icon: Drawable? = this.icError, duration: Int = LENGTH_LONG): Toast =
    Status.error(this, message, icon, duration)

@CheckResult(suggest = "show")
fun Context.stylized(stylized: Stylized): Toast = Stylized.stylized(this, stylized)
