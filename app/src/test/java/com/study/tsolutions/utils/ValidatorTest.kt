package com.study.tsolutions.utils

import org.junit.Assert
import org.junit.Test

class ValidatorTest {

    @Test
    fun emailValidator_CorrectEmail_ReturnsTrue() {
        Assert.assertTrue(Validator.isEmailValid("name@email.com"))
    }

    @Test
    fun emailValidator_IncorrectEmail_ReturnsFalse() {
        Assert.assertFalse(Validator.isEmailValid("abc"))
    }
}