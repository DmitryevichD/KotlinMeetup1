package ru.openbank.meetup.demo.kotlin.slide2

import java.security.cert.X509Certificate

class DestructingDeclaration {

    fun destructOtpDto() {
        val (otp, phone) = OtpDto("4213", "79999999999")

        println(otp)
        println(phone)
    }

    fun destructList() {
        val listOfDtos = listOf(OtpDto("4213", "79999999999"))

        for ((otp, phone) in listOfDtos) {
            println(otp)
            println(phone)
        }
    }

    fun destructLambda() {
        val listOfDtos = listOf(OtpDto("4213", "79999999999"))

        listOfDtos.map { (otp, phone) ->
            println(otp)
            println(phone)
        }
    }

    fun destructFunction() {
        val (otp, phone) = getUsingFunctionReturningOtpDto()
        println(otp)
        println(phone)
    }

    private fun getUsingFunctionReturningOtpDto() = OtpDto("4213", "79999999999")

    fun skippingUnnecessaryVariables() {
        val naiveAcceptingTrustStrategy1 =
            { chain: Array<X509Certificate>, authType: String -> true }
        val naiveAcceptingTrustStrategy2 =
            { chain: Array<X509Certificate>, _: String -> true }
        val naiveAcceptingTrustStrategy3 =
            { _: Array<X509Certificate>, _: String -> true }
    }

    fun destructableComponents() {
        val (otp1, phone1) = OtpDto("4213", "79999999999")
        val (otp2, phone2) = DestructableOtpDto("2134", "79666666666")
    }

    companion object {

    }
}
