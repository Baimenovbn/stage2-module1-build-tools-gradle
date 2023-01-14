package com.epam.utils;

import java.util.List;

public class StringUtils {
    public static boolean isPositiveNumber(String str)  {
        if (str == null) {
            return false;
        }

        if (str.length() > 0 && str.charAt(0) == '0') {
            return false;
        }

        try {
            return Double.parseDouble(str) > 0;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
