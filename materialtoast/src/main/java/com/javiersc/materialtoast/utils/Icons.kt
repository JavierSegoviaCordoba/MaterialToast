package com.javiersc.materialtoast.utils

import android.content.Context
import android.graphics.drawable.Drawable
import com.javiersc.materialtoast.R

internal val Context.icSuccess: Drawable?
    get() = this.getDrawable(R.drawable.ic_success)

internal val Context.icError: Drawable?
    get() = this.getDrawable(R.drawable.ic_error)