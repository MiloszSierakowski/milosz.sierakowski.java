package com.kodilla.stream;

import com.kodilla.stream.beautifier.*;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
        /*
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        System.out.println("End of ezample \n");
*//*
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        PoemDecorator toUpCase = (text) -> {
            return text.toUpperCase();
        };

        System.out.println(poemBeautifier.beautify("Niech to bedzie piekny tekst ", (txt) -> txt + "ABC"));
        System.out.println(poemBeautifier.beautify("a ten niech zostanie zmieniony na nowy z duzych liter", toUpCase));
        System.out.println(poemBeautifier.beautify("dodajemy znaki rowna sie po obu stronach", (txt) -> "====== " + txt + " ====="));
*/
        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);


    }
}