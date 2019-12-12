package ru.openbank.meetup.demo.kotlin.extension

import ru.openbank.meetup.demo.kotlin.slide6.ApplicationField
import ru.openbank.meetup.demo.kotlin.slide6.regexMatches

// can be public
fun isNotNullOrEmpty(charSequence: CharSequence?): Boolean = !charSequence.isNullOrEmpty()

// can be private
private fun isNotNullOrBlank(charSequence: CharSequence?): Boolean = !charSequence.isNullOrBlank()

fun main() {
    val otp: String? = "4567"
    val notNullOrEmpty = isNotNullOrEmpty(otp)
    val notNullOrBlank = isNotNullOrBlank(otp)

    "[0-9]{4}".regexMatches(ApplicationField())

    println(notNullOrEmpty)
    println(notNullOrBlank)
}
