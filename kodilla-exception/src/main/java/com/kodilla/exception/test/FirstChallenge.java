package com.kodilla.exception.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }

    /**
     * This main can throw an ArithmeticException!!!
     *
     * @param args
     */
    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();
        double result = 0;
        try {
            result = firstChallenge.divide(3, 0);
        } catch (ArithmeticException arithmeticException) {
            System.out.println("Nie dzielimy przez zero");
        }finally {
            System.out.println("Data wykonania operacji " + LocalDate.now() + " o godzinie " + LocalTime.now());
        }
        System.out.println(result);
    }
}