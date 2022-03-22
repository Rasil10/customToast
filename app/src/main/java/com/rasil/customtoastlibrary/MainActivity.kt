package com.rasil.customtoastlibrary

import android.os.Bundle
import android.view.Gravity
import androidx.appcompat.app.AppCompatActivity
import com.rasil.customtoast.CustomToast

class MainActivity : AppCompatActivity() {
    lateinit var customToast: CustomToast
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        customToast = CustomToast(this)
        customToast.showSuccessToast(
            "This it Success Toast message"
        )
//        customToast.showErrorToast(
//            "This it Error Toast message"
//        )
//        customToast.showInfoToast(
//            "This it Informative Toast message"
//        )
    }
}