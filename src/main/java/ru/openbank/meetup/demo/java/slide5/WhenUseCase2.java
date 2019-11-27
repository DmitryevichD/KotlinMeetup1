package ru.openbank.meetup.demo.java.slide5;

import org.springframework.util.StringUtils;

public class WhenUseCase2 {

    String formatPhoneNumber(String phone) {
        if (!StringUtils.isEmpty(phone) && phone.length() > 10) {
            return phone.substring(phone.length() - 10);
        }
        return phone;
    }
}
