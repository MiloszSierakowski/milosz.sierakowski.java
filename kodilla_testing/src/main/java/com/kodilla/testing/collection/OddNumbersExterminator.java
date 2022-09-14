package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {
    public List<Integer> exterminate(List<Integer> numbers) {
        List<Integer> onlyEvenNumbers = new ArrayList<>();

        for (Integer integer : numbers) {
            if (integer % 2 == 0) {
                onlyEvenNumbers.add(integer);
            }
        }

        return onlyEvenNumbers;
    }
}
