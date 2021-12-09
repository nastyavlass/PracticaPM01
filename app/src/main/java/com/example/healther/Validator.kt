package com.example.healther

import android.content.Context

class Validator(private val context: Context) {

    fun validatorEmail(email: String): String? {
        if (!email.isEmpty() && android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches())
            return null
        else
            return context.getString(R.string.oshibka)

    }
    fun validatorPassword(password: String): String? {
        if (!password.isEmpty() && password.length > 10)
            return null
        else
            return context.getString(R.string.oshibka)

    }
}