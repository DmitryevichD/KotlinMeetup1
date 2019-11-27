package ru.openbank.meetup.demo.java.slide6;

import lombok.extern.slf4j.Slf4j;
import org.springframework.util.StringUtils;

@Slf4j
public class AlsoUseCase {
    private boolean checkRegex(String field, ApplicationField fieldConfig) {
        String regex = fetchRegex(fieldConfig);
        if (regex == null) {
            log.trace("Regex is not specified for this field [{}]", fieldConfig.getName());
            return true;
        }
        return field.matches(regex);
    }

    private String fetchRegex(ApplicationField fieldConfig) {
        String regex = null;
        if (!StringUtils.isEmpty(fieldConfig.getRegEx())) {
            regex = fieldConfig.getRegEx();
        } else if (!StringUtils.isEmpty(fieldConfig.getType())) {
            regex = findRegExpByName(fieldConfig.getType());
        }
        return regex;
    }

    private String findRegExpByName(String type) {
        return "";
    }
}
