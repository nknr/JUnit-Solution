package com.study.tsolutions.utils

import android.text.TextUtils
import io.mockk.every
import io.mockk.mockkStatic
import org.junit.Assert
import org.junit.Test

class ValidatorTest : Assert() {

    @Test
    fun emailValidator_CorrectEmail_ReturnsTrue() {
        assertTrue(Validator.isEmailValid("name@email.com"))
    }

    @Test
    fun emailValidator_IncorrectEmail_ReturnsFalse() {
        assertFalse(Validator.isEmailValid("abc"))
    }

    @Test
    fun test() {
        mockkStatic(TextUtils::class)
        every { TextUtils.isDigitsOnly(any()) } returns true
        assertTrue(Validator.isNumberValid("1234"))
    }
}