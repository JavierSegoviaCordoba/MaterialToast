package com.javiersc.materialtoastdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.content.res.ResourcesCompat
import com.javiersc.materialtoast.*
import com.javiersc.materialtoast.toasts.Stylized
import com.javiersc.materialtoast.utils.ToastShape
import com.javiersc.materialtoast.utils.dp
import kotlinx.android.synthetic.main.activity_main.*


@Suppress("UNUSED_PARAMETER")
class MainActivity : AppCompatActivity() {

    private val text = "Lorem ipsum dolor sit amet"
    private val textLong = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. In quis augue dignissim."
    private val textStylized = "Pellentesque eleifend magna in efficitur."

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        materialButtonNormal.setOnClickListener { normal(text).show() }
        materialButtonSuccess.setOnClickListener { success(text).show() }
        materialButtonWarning.setOnClickListener { warning(text).show() }
        materialButtonError.setOnClickListener { error(text).show() }

        materialButtonNormalLong.setOnClickListener { normal(textLong).show() }
        materialButtonSuccessLong.setOnClickListener { success(textLong).show() }
        materialButtonWarningLong.setOnClickListener { warning(textLong).show() }
        materialButtonErrorLong.setOnClickListener { error(textLong).show() }

        materialButtonStylized1.setOnClickListener {
            val myStylized = Stylized().apply {
                message = textStylized
                messageColor = ContextCompat.getColor(this@MainActivity, R.color.stylizedText)
                icon = ContextCompat.getDrawable(this@MainActivity, R.drawable.ic_stylized_1)
                iconTint = ContextCompat.getColor(this@MainActivity, R.color.stylizedIcon1)
                backgroundColor = ContextCompat.getColor(this@MainActivity, R.color.stylizedBackground1)
                shape = ToastShape.CUT
                radius = 16f.dp
            }
            stylized(myStylized).show()
        }
        materialButtonStylized2.setOnClickListener {
            val myStylized = Stylized().apply {
                message = textStylized
                messageColor = ContextCompat.getColor(this@MainActivity, R.color.stylizedText)
                icon = ContextCompat.getDrawable(this@MainActivity, R.drawable.ic_stylized_2)
                iconTint = ContextCompat.getColor(this@MainActivity, R.color.stylizedIcon2)
                backgroundColor = ContextCompat.getColor(this@MainActivity, R.color.stylizedBackground2)
                strokeWidth = 2.dp
                strokeColor = ContextCompat.getColor(this@MainActivity, R.color.stylizedStroke2)
                shape = ToastShape.CUT
                radius = 8f.dp
            }
            stylized(myStylized).show()
        }
        materialButtonStylized3.setOnClickListener {
            val myStylized = Stylized().apply {
                message = text
                messageColor = ContextCompat.getColor(this@MainActivity, R.color.stylizedText3)
                val font = ResourcesCompat.getFont(this@MainActivity, R.font.inconsolata_bold)
                font?.let { typeface = it }
                icon = ContextCompat.getDrawable(this@MainActivity, R.drawable.ic_stylized_3)
                iconTint = ContextCompat.getColor(this@MainActivity, R.color.stylizedIcon3)
                backgroundColor = ContextCompat.getColor(this@MainActivity, R.color.stylizedBackground3)
                radius = 8f.dp
                elevation = 8f.dp
            }
            stylized(myStylized).show()
        }

    }

}

