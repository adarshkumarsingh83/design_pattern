package com.espark.adarsh;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ApplicationMain {

    public static void main(String[] args) {
        List<Integer> numbers=IntStream.range(1,10).boxed().collect(Collectors.toList());
        System.out.println("number "+UtilOperations.doOperation(numbers,number->true));
        System.out.println("even "+UtilOperations.doOperation(numbers,UtilOperations::isEvent));
        System.out.println("odd "+UtilOperations.doOperation(numbers,UtilOperations::isOdd));
    }
}
