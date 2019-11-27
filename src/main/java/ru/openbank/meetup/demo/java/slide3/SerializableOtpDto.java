package ru.openbank.meetup.demo.java.slide3;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Pattern;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("Otp")
@JsonIgnoreProperties(ignoreUnknown = true)
public class SerializableOtpDto implements Serializable {

    private static final long serialVersionUID = -1069041605866219052L;

    @ApiModelProperty(example = "1234")
    @Pattern(regexp = "[0-9]{4}")
    private String otp;

    @ApiModelProperty(example = "71112223344")
    @Pattern(regexp = "7[0-9]{10}")
    private String phone;

}
