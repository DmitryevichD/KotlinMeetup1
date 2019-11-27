package ru.openbank.meetup.demo.kotlin.slide5

fun formatPhoneNumber(phone: String?): String? {
    return when (phone.isTooLong()) {
        true -> phone?.substring(phone.length - MAX_PHONE_LENGTH)
        false -> phone
    }
}

private fun String?.isTooLong(): Boolean {
    return !this.isNullOrEmpty() && this.length > MAX_PHONE_LENGTH
}

private const val MAX_PHONE_LENGTH = 10
