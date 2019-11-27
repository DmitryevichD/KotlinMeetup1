package ru.openbank.meetup.demo.kotlin.slide2

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
import javax.validation.constraints.Pattern

@ApiModel("Otp")
@JsonIgnoreProperties(ignoreUnknown = true)
data class OtpDto(

    @field:ApiModelProperty(example = "1234")
    @field:Pattern(regexp = "[0-9]{4}")
    var otp: String? = null,

    @field:ApiModelProperty(example = "71112223344")
    @field:Pattern(regexp = "7[0-9]{10}")
    var phone: String? = null
)
