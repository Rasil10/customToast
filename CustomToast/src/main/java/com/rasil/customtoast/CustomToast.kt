package com.rasil.customtoast

import android.content.Context
import android.view.Gravity

class CustomToast(var context: Context) {
    var gravity = Gravity.BOTTOM

    constructor(context: Context, gravity: Int) : this(context) {
        this.context = context
        this.gravity = gravity
    }

    fun showSuccessToast(message: String?) {
        CustomToastHelper(context, gravity).showSuccessToast(message)
    }

    fun showInfoToast(message: String?) {
        CustomToastHelper(context, gravity).showInfoToast(message)
    }

    fun showErrorToast(message: String?) {
        CustomToastHelper(context, gravity).showErrorToast(message)
    }
}