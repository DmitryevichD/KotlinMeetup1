package ru.openbank.meetup.demo.kotlin.trailinglambdas

import ru.openbank.meetup.demo.kotlin.slide2.OtpDto


class TrailingLambdasUseCase {

    private var otpToPhoneLambda: (OtpDto) -> String? = { item -> item.phone }

    private fun invokeTrailingLambda(lambdaParam: (OtpDto) -> String?): String? {
        return lambdaParam.invoke(OtpDto("5678", "79999999999"))
    }

    private fun invokeTrailingLambdaWithParam(otpDto: OtpDto, lambdaParam: (OtpDto) -> String?): String? {
        return lambdaParam(otpDto)
    }

    fun lambdaUse() {
        invokeTrailingLambda(otpToPhoneLambda)
        invokeTrailingLambda { otpToPhoneLambda.invoke(it) }

        invokeTrailingLambda { it -> it.phone }
        invokeTrailingLambda { it.phone }

        invokeTrailingLambda { otpDto -> otpDto.phone }
        invokeTrailingLambda { otpDto: OtpDto -> otpDto.phone }


        val otp = OtpDto("5678", "79999999999")
        invokeTrailingLambdaWithParam(otp, otpToPhoneLambda)
        invokeTrailingLambdaWithParam(otp) { otpToPhoneLambda.invoke(it) }

        invokeTrailingLambdaWithParam(otp) { it -> it.phone }
        invokeTrailingLambdaWithParam(otp) { it.phone }

        invokeTrailingLambdaWithParam(otp) { otpDto -> otpDto.phone }
        invokeTrailingLambdaWithParam(otp) { otpDto: OtpDto -> otpDto.phone }
    }
}
