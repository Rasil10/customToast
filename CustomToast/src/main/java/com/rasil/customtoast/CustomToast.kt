package com.rasil.customtoast

import android.content.Context

class CustomToast {
    fun showSuccessToast(c: Context?, message: String?) {
        CustomToastHelper(c!!).showSuccessToast(message)
    }

    fun showInfoToast(c: Context?, message: String?) {
        CustomToastHelper(c!!).showInfoToast(message)
    }

    fun showErrorToast(c: Context?, message: String?) {
        CustomToastHelper(c!!).showErrorToast(message)
    }
}