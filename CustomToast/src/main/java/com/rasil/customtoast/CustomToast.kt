package com.rasil.customtoast

import android.content.Context
import android.widget.Toast

class CustomToast {
    fun show(c: Context?, message: String?) {
        Toast.makeText(c, message, Toast.LENGTH_SHORT).show()
    }
}