package org.example.core;

import org.example.StringUtils;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(String... args) {
        for (String arg : args) {
            if (!StringUtils.isPositiveNumber(arg)) {
                return false;
            }
        }
        return true;
    }
}