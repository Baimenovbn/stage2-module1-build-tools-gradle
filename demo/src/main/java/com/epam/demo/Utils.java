package com.epam.demo;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        return args.stream().mapToDouble(num -> {
            try {
                return Double.parseDouble(num);
            } catch (NumberFormatException e) {
                return -1;
            }
        }).allMatch(num -> num > 0);
    }
}