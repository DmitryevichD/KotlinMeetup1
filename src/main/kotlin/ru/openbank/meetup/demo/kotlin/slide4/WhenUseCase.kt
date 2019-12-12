package ru.openbank.meetup.demo.kotlin.slide4

import java.util.regex.Pattern

@Suppress("MagicNumber")
object InnValidator {

    private val PATTERN = Pattern.compile("^((?!0{10})\\d{10})|((?!0{12})\\d{12})$")

    private const val INN_OF_INDIVIDUAL_LENGTH = 12
    private const val INN_OF_LLC_LENGTH = 10

    fun isValid(inn: String?): Boolean {
        return when (inn?.length) {
            null -> true
            INN_OF_LLC_LENGTH -> inn.isCorrectInn() && isValidINNWithTenNumbers(inn)
            INN_OF_INDIVIDUAL_LENGTH -> inn.isCorrectInn() && isValidINNWitTwelveNumbers(inn)
            else -> false
        }
    }

    private fun String.isCorrectInn(): Boolean = PATTERN.matcher(this).matches()

    private fun isValidINNWithTenNumbers(sourceInn: String): Boolean {
        return true;
    }

    private fun isValidINNWitTwelveNumbers(sourceInn: String): Boolean {
        return true
    }
}

fun main() {
    InnValidator.isValid("")
}
