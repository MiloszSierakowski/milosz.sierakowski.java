package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;
import java.util.Arrays;
import java.util.List;

public class CollectionTestSuite {
    private OddNumbersExterminator oddNumbersExterminator;

    @BeforeEach
    void setUp() {
        System.out.println("Test Case: begin");
        oddNumbersExterminator = new OddNumbersExterminator();
    }

    @AfterEach
    void after(){
        System.out.println("Test Case: end");
    }

    @DisplayName("When method named exterminate get empty List" +
            " then this method should return empty List")
    @Test
    void testOddNumbersExterminatorEmptyList() {

        Integer[] intigerArray = {};
        List<Integer> integers = Arrays.asList(intigerArray);
        List<Integer> testintegers = oddNumbersExterminator.exterminate(integers);

        Assertions.assertTrue(testintegers.isEmpty());
    }

    @DisplayName("When method named exterminate get List with numbers" +
            " then this method should return List only with even numbers")
    @Test
    void testOddNumbersExterminatorNormalList() {
        Integer[] intigerArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> integers = Arrays.asList(intigerArray);
        List<Integer> testIntegersList = oddNumbersExterminator.exterminate(integers);

        int[] testInteger = {0, 2, 4, 6, 8, 10};
        for (int i = 0; i < testInteger.length; i++){
            Assertions.assertEquals(testInteger[i],testIntegersList.get(i));
        }

    }

}
