package com.kodilla.testing;

import com.kodilla.testing.collection.OddNumbersExterminator;

import java.util.Arrays;
import java.util.List;

public class TestingMain {
    public static void main(String[] args) {
        OddNumbersExterminator test = new OddNumbersExterminator();

        Integer[] integers = {0, 1, 2};
        List<Integer> list = Arrays.asList(integers);

        List<Integer> newTest = test.exterminate(list);

        for (Integer integer : newTest) {
            System.out.println("intiger = " + integer);
        }
    }
}
