package com.javiersc.materialtoast.utils

import android.content.Context
import android.graphics.drawable.Drawable
import androidx.core.content.ContextCompat
import com.javiersc.materialtoast.R

internal val Context.icSuccess: Drawable?
    get() = ContextCompat.getDrawable(this, R.drawable.ic_success)

internal val Context.icWarning: Drawable?
    get() = ContextCompat.getDrawable(this, R.drawable.ic_warning)

internal val Context.icError: Drawable?
    get() = ContextCompat.getDrawable(this, R.drawable.ic_error)