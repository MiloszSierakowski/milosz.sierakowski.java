package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class BoardTestSuite {

    @Test
    void testTaskAdd() {

        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring.portfolio");

        Board board = context.getBean(Board.class);

        board.doneList.tasks.add("Zrobiono test do zadania 14.3");
        board.inProgressList.tasks.add("Wykonujemy resztę zadań z modułu 14");
        board.toDoList.tasks.add("Trzeba zastanowić się co zrobić z zadaniem 13.4");

        assertAll(
                () -> assertEquals("Zrobiono test do zadania 14.3", board.doneList.tasks.get(0)),
                () -> assertEquals("Wykonujemy resztę zadań z modułu 14", board.inProgressList.tasks.get(0)),
                () -> assertEquals("Trzeba zastanowić się co zrobić z zadaniem 13.4", board.toDoList.tasks.get(0))
        );
    }
}
