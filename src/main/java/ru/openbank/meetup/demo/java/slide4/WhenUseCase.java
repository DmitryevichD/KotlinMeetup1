package ru.openbank.meetup.demo.java.slide4;

import java.util.regex.Pattern;


public final class WhenUseCase {

    private WhenUseCase() {
    }

    private static final Pattern PATTERN = Pattern.compile("^((?!0{10})\\d{10})|((?!0{12})\\d{12})$");

    public static boolean isValid(String inn) {
        if (inn == null) {
            //возвращаем true, т.к. для проверки на null должна использоваться аннотация @NotNull
            return true;
        }

        if (!PATTERN.matcher(inn).matches()) {
            return false;
        }

        if (inn.length() == 12) {
            return isValidINNWitTwelveNumbers(inn);
        }

        if (inn.length() == 10) {
            return isValidINNWithTenNumbers(inn);
        }

        return false;
    }

    private static boolean isValidINNWithTenNumbers(String sourceInn) {
        return true;

    }

    private static boolean isValidINNWitTwelveNumbers(String sourceInn) {
        return true;
    }
}
