package ru.openbank.meetup.demo.java.delegation;

import java.util.HashMap;
import java.util.Map;

public class DelegationUseCase {

    private static final Map<String, String> map = new HashMap<>();
    private static final String PROMO = "promo";
    private static final String CODE = "code";
    private static final String PHONE = "phone";
    private static final String TYPE = "type";

    public static void main(String[] args) {
        map.put(PROMO, "a value");
        map.put(CODE, "another value");
        map.put(PHONE, "one more value");
        map.put(TYPE, "even more value");

        String promo = map.get(PROMO);
        String code = map.get(CODE);
        String phone = map.get(PHONE);
        String type = map.get(TYPE);
    }
}
