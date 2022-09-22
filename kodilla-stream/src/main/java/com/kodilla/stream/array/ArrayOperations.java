package com.kodilla.stream.array;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {
    static Double getAverage(int[] numbers){
        IntStream.range(0,numbers.length)
                .map(n-> numbers[n])
                .forEach(System.out::println);

        Double averageFromArray = IntStream.range(0,numbers.length)
                .map(n -> numbers[n])
                .average()
                .orElse(Double.NaN);

        System.out.println("Liczby w strumieniu " + numbers.length);

        return averageFromArray;
    };
}
