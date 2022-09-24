package com.study.tsolutions.utils

import java.util.regex.Pattern

object Validator {

    fun isEmailValid(email: String): Boolean {
        val validEmailRegex = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE)
        return validEmailRegex.matcher(email).find()
    }
}