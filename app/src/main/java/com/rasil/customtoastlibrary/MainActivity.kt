package com.rasil.customtoastlibrary

import android.os.Bundle
import android.view.Gravity
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.rasil.customtoast.CustomToast

class MainActivity : AppCompatActivity() {
    lateinit var customToast: CustomToast
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        customToast = CustomToast(this)
        customToast.hideHeader = false
        customToast.hideIcon = false
        customToast.gravity = Gravity.CENTER

//        customToast.showSuccessToast(
//            "This it Success Toast message. This it Success Toast message. This it Success Toast message. This it Success Toast message. This it Success Toast message. This it Success Toast message. This it Success Toast message. This it Success Toast message. This it Success Toast message. This it Success Toast message. This it Success Toast message. This it Success Toast message. "
//        )
        customToast.showInfoToast(
            "This it Error Toast message",
            ContextCompat.getColor(this,R.color.purple_500)
        )
//        customToast.showInfoToast(
//            "This it Informative Toast message"
//        )

    }
}