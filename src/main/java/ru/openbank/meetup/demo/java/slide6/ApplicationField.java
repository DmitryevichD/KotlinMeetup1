package ru.openbank.meetup.demo.java.slide6;

import lombok.Data;

import java.util.List;

@Data
public class ApplicationField {

    private String name;

    private String type;

    private String regEx;

    private boolean required;

    private List<String> postProcessors;

    private String ordersPath;
}
