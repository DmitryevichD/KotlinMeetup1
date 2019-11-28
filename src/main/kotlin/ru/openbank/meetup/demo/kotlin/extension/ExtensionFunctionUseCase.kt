package ru.openbank.meetup.demo.kotlin.extension

import ru.openbank.meetup.demo.kotlin.slide6.ApplicationField
import ru.openbank.meetup.demo.kotlin.slide6.regexMatches

fun CharSequence?.isNotNullOrEmpty(): Boolean = !this.isNullOrEmpty()

fun CharSequence?.isNotNullOrBlank(): Boolean = !this.isNullOrBlank()

fun main() {
    val otp: String? = "4567"
    val notNullOrEmpty = otp.isNotNullOrEmpty()
    val notNullOrBlank = otp.isNotNullOrBlank()

    "".regexMatches(ApplicationField())
}
