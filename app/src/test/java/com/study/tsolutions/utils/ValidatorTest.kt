package com.study.tsolutions.utils

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
        assertTrue(Validator.isNumberValid("1234"))
    }
}