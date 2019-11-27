package ru.openbank.meetup.demo.java.slide1;

import lombok.Data;

import java.util.List;

/**
 * Содержит информацию, необходимую для отправки email.
 */
@Data
public class EmailDto {
    private String subject;
    private String from;
    private String personal;
    private List<String> to;
    private List<String> cc;
    private String body;
    private boolean html;
}
