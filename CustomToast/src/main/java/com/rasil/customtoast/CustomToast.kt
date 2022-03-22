package com.rasil.customtoast

import android.app.Activity
import android.content.Context
import android.view.Gravity
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat

class CustomToast(var context: Context) {
    var gravity = Gravity.BOTTOM
    var hideIcon = false
    var hideHeader = false
    var backgroundColor: Int? = null

    fun showSuccessToast(message: String?) {
        backgroundColor = ContextCompat.getColor(context, R.color.success)
        CustomToastHelper(
            context,
            "success",
            backgroundColor!!,
            gravity,
            hideIcon,
            hideHeader
        ).showToast(
            message
        )
    }

    fun showInfoToast(message: String?) {
        backgroundColor = ContextCompat.getColor(context, R.color.info)

        CustomToastHelper(
            context,
            "info",
            backgroundColor!!,
            gravity,
            hideIcon,
            hideHeader
        ).showToast(message)
    }

    fun showErrorToast(message: String?) {
        backgroundColor = ContextCompat.getColor(context, R.color.error)

        CustomToastHelper(
            context,
            "error",
            backgroundColor!!,
            gravity,
            hideIcon,
            hideHeader
        ).showToast(message)
    }

    fun showCustomColorToast(message: String?, backgroundColor: Int) {
        this.backgroundColor = backgroundColor

        CustomToastHelper(
            context,
            "error",
            backgroundColor,
            gravity,
            hideIcon,
            hideHeader
        ).showToast(message)
    }

    class CustomToastHelper(
        private val context: Context,
        private val type: String,
        private val color: Int,
        private val gravity: Int,
        private val hideIcon: Boolean,
        private val hideHeader: Boolean,
    ) {
        fun showToast(message: String?) {
            val inflater = (context as Activity).layoutInflater
            val toastRoot: View = inflater.inflate(R.layout.layout_toast, null)
            val linearLayout = toastRoot.findViewById<LinearLayout>(R.id.whole_layout)
            val toastHeader = toastRoot.findViewById<TextView>(R.id.toastTitle)
            val toastImage = toastRoot.findViewById<ImageView>(R.id.toastImg)
            val toastSuccessTv = toastRoot.findViewById<TextView>(R.id.toastDesc)
            linearLayout.setBackgroundColor(color)

            when (type.lowercase()) {
                "success" -> {
                    toastHeader.text = context.getResources().getString(R.string.success)
                    toastSuccessTv.text = message
                    toastImage.setImageDrawable(
                        ContextCompat.getDrawable(
                            context,
                            R.drawable.ic_success
                        )
                    )
                }
                "error" -> {
                    toastHeader.text = context.getResources().getString(R.string.error)
                    toastSuccessTv.text = message
                    toastImage.setImageDrawable(
                        ContextCompat.getDrawable(
                            context,
                            R.drawable.ic_error
                        )
                    )
                }
                "info" -> {
                    toastHeader.text = context.getResources().getString(R.string.info)
                    toastSuccessTv.text = message
                    toastImage.setImageDrawable(
                        ContextCompat.getDrawable(
                            context,
                            R.drawable.ic_info
                        )
                    )
                }
            }


            if (hideIcon)
                toastImage.visibility = View.GONE
            if (hideHeader)
                toastHeader.visibility = View.GONE

            val toast = Toast(context)
            toast.setView(toastRoot)
            toast.setGravity(
                gravity or Gravity.FILL_HORIZONTAL,
                0, 0
            )
            toast.duration = Toast.LENGTH_SHORT
            toast.show()

        }
    }
}