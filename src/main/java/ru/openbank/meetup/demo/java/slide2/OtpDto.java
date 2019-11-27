package ru.openbank.meetup.demo.java.slide2;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Pattern;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("Otp")
@JsonIgnoreProperties(ignoreUnknown = true)
public class OtpDto {

    @ApiModelProperty(example = "1234")
    @Pattern(regexp = "[0-9]{4}")
    private String otp;

    @ApiModelProperty(example = "71112223344")
    @Pattern(regexp = "7[0-9]{10}")
    private String phone;

}
