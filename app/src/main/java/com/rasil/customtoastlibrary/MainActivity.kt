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
        customToast.hideHeader = true
        customToast.hideIcon = false
        customToast.gravity = Gravity.CENTER

        customToast.showSuccessToast(
            "This it Success Toast message. This it Success Toast message. This it Success Toast message. This it Success Toast message. This it Success Toast message. This it Success Toast message. This it Success Toast message. This it Success Toast message. This it Success Toast message. This it Success Toast message. This it Success Toast message. This it Success Toast message. "
        )
        customToast.showErrorToast(
            "This it Error Toast message"
        )
        customToast.showInfoToast(
            "This it Informative Toast message"
        )
        customToast.showCustomColorToast(
            "This it Custom COlor Toast message", ContextCompat.getColor(this, R.color.purple_200)
        )
    }
}