package com.kodilla.stream;

/*import com.kodilla.stream.beautifier.*;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;
import com.kodilla.stream.person.People;*/

import com.kodilla.stream.book.*;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        PoemDecorator toUpCase = (text) -> {
            return text.toUpperCase();
        };

        System.out.println(poemBeautifier.beautify("Niech to bedzie piekny tekst ", (txt) -> txt + "ABC"));
        System.out.println(poemBeautifier.beautify("a ten niech zostanie zmieniony na nowy z duzych liter", toUpCase));
        System.out.println(poemBeautifier.beautify("dodajemy znaki rowna sie po obu stronach", (txt) -> "====== " + txt + " ====="));

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);*/

//==========================================================
        /*BookDirectory theBookDirectory = new BookDirectory();
        String theResultStringOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n", "<<", ">>"));

        System.out.println(theResultStringOfBooks);*/


        Forum forum = new Forum();
        Map<Integer, ForumUser> theResultMapOfForumUser = forum.getList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> (LocalDate.now().getYear() - forumUser.getDateOfBirth().getYear()) > 20)
                .filter(forumUser -> forumUser.getNumberOfTotalPosts() > 0)
                .collect(Collectors.toMap(ForumUser::getIdNumber, forumUser -> forumUser));

        System.out.println("# elements: " + theResultMapOfForumUser.size());
        theResultMapOfForumUser.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

        String liczba = "165183543368311";
        BigDecimal bigDecimal = new BigDecimal(liczba);

    }
}