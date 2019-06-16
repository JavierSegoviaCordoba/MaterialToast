package com.javiersc.materialtoast

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.content.res.ResourcesCompat
import com.javiersc.materialtoast.toasts.Stylized
import com.javiersc.materialtoast.utils.ToastShape
import com.javiersc.materialtoast.utils.dp

class MainActivity : AppCompatActivity() {

    private val text = "Lorem ipsum dolor sit amet"
    private val textLong = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. In quis augue dignissim."
    private val textStylized = "Pellentesque eleifend magna in efficitur."

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun clickNormal(@Suppress("UNUSED_PARAMETER") view: View) = normal(text).show()

    fun clickSuccess(@Suppress("UNUSED_PARAMETER") view: View) = success(text).show()

    fun clickError(@Suppress("UNUSED_PARAMETER") view: View) = error(text).show()


    fun clickNormalTextLong(@Suppress("UNUSED_PARAMETER") view: View) =
        Toast.makeText(this, textLong, Toast.LENGTH_LONG).show()

    fun clickSuccessTextLong(@Suppress("UNUSED_PARAMETER") view: View) = success(textLong).show()

    fun clickErrorTextLong(@Suppress("UNUSED_PARAMETER") view: View) = error(textLong).show()


    fun clickStylized1(@Suppress("UNUSED_PARAMETER") view: View) {
        val stylized = Stylized().apply {
            message = textStylized
            messageColor = ContextCompat.getColor(this@MainActivity, R.color.stylizedText)
            icon = getDrawable(R.drawable.ic_stylized_1)
            iconTint = ContextCompat.getColor(this@MainActivity, R.color.stylizedIcon1)
            backgroundColor = ContextCompat.getColor(this@MainActivity, R.color.stylizedBackground1)
            shape = ToastShape.CUT
            radius = 16f.dp()
        }
        stylized(stylized).show()
    }

    fun clickStylized2(@Suppress("UNUSED_PARAMETER") view: View) {
        val stylized = Stylized().apply {
            message = textStylized
            messageColor = ContextCompat.getColor(this@MainActivity, R.color.stylizedText)
            icon = getDrawable(R.drawable.ic_stylized_2)
            iconTint = ContextCompat.getColor(this@MainActivity, R.color.stylizedIcon2)
            backgroundColor = ContextCompat.getColor(this@MainActivity, R.color.stylizedBackground2)
            strokeWidth = 2.dp()
            strokeColor = ContextCompat.getColor(this@MainActivity, R.color.stylizedStroke2)
            shape = ToastShape.CUT
            radius = 8f.dp()
        }
        stylized(stylized).show()
    }

    fun clickStylized3(@Suppress("UNUSED_PARAMETER") view: View) {
        val stylized = Stylized().apply {
            message = text
            messageColor = ContextCompat.getColor(this@MainActivity, R.color.stylizedText3)
            val font = ResourcesCompat.getFont(this@MainActivity, R.font.inconsolata_bold)
            font?.let { typeface = it }
            icon = getDrawable(R.drawable.ic_stylized_3)
            iconTint = ContextCompat.getColor(this@MainActivity, R.color.stylizedIcon3)
            backgroundColor = ContextCompat.getColor(this@MainActivity, R.color.stylizedBackground3)
            radius = 8f.dp()
            elevation = 8f.dp()
        }
        stylized(stylized).show()
    }

}

