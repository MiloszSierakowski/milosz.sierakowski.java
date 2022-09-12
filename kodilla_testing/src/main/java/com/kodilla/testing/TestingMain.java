package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator calculator = new Calculator();

        int valueA = 5;
        int valueB = 2;

        if (valueA + valueB == calculator.add(valueA, valueB)){
            System.out.println("Add test OK");
        }else System.out.println("Error!");

        if (valueA - valueB == calculator.subtract(valueA, valueB)){
            System.out.println("Subtract test OK");
        }else System.out.println("Error!");
    }
}
