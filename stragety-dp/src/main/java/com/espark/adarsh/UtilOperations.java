package com.espark.adarsh;

import java.util.List;
import java.util.function.Predicate;

public class UtilOperations {

    public static Integer doOperation(List<Integer> numbers, Predicate<Integer> selector) {
        return numbers.stream()
                .filter(selector)
                .mapToInt(element -> element)
                .sum();
    }

    public static boolean isEvent(Integer number) {
        return number % 2 == 0;
    }

    public static boolean isOdd(Integer number) {
        return number % 2 != 0;
    }
}
