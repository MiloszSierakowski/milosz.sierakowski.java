package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayOperationsTestSuite {
    @Test
    void testGetAverage(){
        int[] testValues = {15,13,45,18,89,70,76,56};
        Double averageFromArray = ArrayOperations.getAverage(testValues);
        assertEquals(47.75,averageFromArray);
    }
}
