package com.example.healther

import android.content.Context

class Validator(private val context: Context) {

    fun validatorEmail(email: String): String? {
        return if (email.isNotEmpty() && android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches())
            null
        else if (email.isEmpty())
            context.getString(R.string.empty_email)
        else
            context.getString(R.string.error_email)

    }
    fun validatorPassword(password: String): String? {
        return if (password.isNotEmpty() && password.length > 10)
            null
        else if(password.isEmpty())
            context.getString(R.string.empty_password)
        else
            context.getString(R.string.error_password)
    }
    fun validatorName(name: String): String? {
        return if(name.isNotEmpty() && name.length > 6)
            null
        else if(name.isEmpty())
            context.getString(R.string.empty_name)
        else
            context.getString(R.string.error_name)
    }
}