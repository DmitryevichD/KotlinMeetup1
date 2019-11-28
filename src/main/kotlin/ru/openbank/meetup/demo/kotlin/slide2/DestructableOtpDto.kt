package ru.openbank.meetup.demo.kotlin.slide2

//TODO: DO NOT FORGET TO REPLACE COMPONENTS ON CHANGING CONSTRUCTOR
class DestructableOtpDto(
    var otp: String? = null,
    var phone: String? = null
) {
    operator fun component1(): String? = otp

    operator fun component2(): String? = phone
}
