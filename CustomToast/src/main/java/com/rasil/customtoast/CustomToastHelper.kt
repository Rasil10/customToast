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
import kotlin.Result.Companion.success

class CustomToastHelper(private val context: Context, private val gravity:Int) {
    fun showSuccessToast(message: String?) {
        if (context != null) {
            val inflater = (context as Activity).layoutInflater
            val toastRoot: View = inflater.inflate(R.layout.layout_toast, null)
            val linearLayout = toastRoot.findViewById<LinearLayout>(R.id.whole_layout)
            linearLayout.setBackgroundColor(ContextCompat.getColor(context, R.color.success))
            val toastText = toastRoot.findViewById<TextView>(R.id.toastTitle)
            val toastImage = toastRoot.findViewById<ImageView>(R.id.toastImg)
            val toastSuccessTv = toastRoot.findViewById<TextView>(R.id.toastDesc)

            toastText.text = context.getResources().getString(R.string.success)
            toastSuccessTv.text = message
            toastImage.setImageDrawable(ContextCompat.getDrawable(context,R.drawable.ic_success))

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
    fun showErrorToast(message: String?) {
        if (context != null) {
            val inflater = (context as Activity).layoutInflater
            val toastRoot: View = inflater.inflate(R.layout.layout_toast, null)
            val linearLayout = toastRoot.findViewById<LinearLayout>(R.id.whole_layout)
            linearLayout.setBackgroundColor(ContextCompat.getColor(context, R.color.error))
            val toastText = toastRoot.findViewById<TextView>(R.id.toastTitle)
            val toastImage = toastRoot.findViewById<ImageView>(R.id.toastImg)
            val toastSuccessTv = toastRoot.findViewById<TextView>(R.id.toastDesc)

            toastText.text = context.getResources().getString(R.string.error)
            toastSuccessTv.text = message
            toastImage.setImageDrawable(ContextCompat.getDrawable(context,R.drawable.ic_error))

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
    fun showInfoToast(message: String?) {
        if (context != null) {
            val inflater = (context as Activity).layoutInflater
            val toastRoot: View = inflater.inflate(R.layout.layout_toast, null)
            val linearLayout = toastRoot.findViewById<LinearLayout>(R.id.whole_layout)
            linearLayout.setBackgroundColor(ContextCompat.getColor(context, R.color.info))
            val toastText = toastRoot.findViewById<TextView>(R.id.toastTitle)
            val toastImage = toastRoot.findViewById<ImageView>(R.id.toastImg)
            val toastSuccessTv = toastRoot.findViewById<TextView>(R.id.toastDesc)

            toastText.text = context.getResources().getString(R.string.info)
            toastSuccessTv.text = message
            toastImage.setImageDrawable(ContextCompat.getDrawable(context,R.drawable.ic_info))

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