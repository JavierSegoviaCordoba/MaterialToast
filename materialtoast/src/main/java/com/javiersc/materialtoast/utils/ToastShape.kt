package com.javiersc.materialtoast.utils

import com.google.android.material.shape.CutCornerTreatment
import com.google.android.material.shape.RoundedCornerTreatment
import com.google.android.material.shape.ShapeAppearanceModel
import com.javiersc.materialtoast.toasts.Stylized


enum class ToastShape {
    ROUNDED {
        override fun setupShape(stylized: Stylized) = ShapeAppearanceModel().apply {
            with(stylized) {
                setAllCorners(RoundedCornerTreatment(radius))
                setCornerRadius(radius)
            }
        }
    },
    CUT {
        override fun setupShape(stylized: Stylized) = ShapeAppearanceModel().apply {
            with(stylized) {
                setAllCorners(CutCornerTreatment(radius))
                setCornerRadius(radius)
            }
        }
    };

    abstract fun setupShape(stylized: Stylized): ShapeAppearanceModel

}

