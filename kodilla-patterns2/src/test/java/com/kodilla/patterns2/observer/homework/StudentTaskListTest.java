package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentTaskListTest {

    @Test
    void testUpdate(){
        Student miloszS = new Student("Milosz S");
        Student alaS = new Student("Ala S");
        Student mariuszZ = new Student("Mariusz S");
        Mentor tomaszSkala = new Mentor("Tomasz Skala");
        Mentor benedyktOgorek = new Mentor("Benedykt Ogorek");

        miloszS.registerObserver(tomaszSkala);
        miloszS.registerObserver(benedyktOgorek);
        alaS.registerObserver(benedyktOgorek);
        mariuszZ.registerObserver(benedyktOgorek);
        mariuszZ.registerObserver(tomaszSkala);

        miloszS.addTaskToCheck("Zadanie: kolejki z zadaniami do sprawdzenia");
        alaS.addTaskToCheck("Zadanie: Dodajemy logowanie zadan do fasady");
        mariuszZ.addTaskToCheck("Zadanie: Dekorujemy pizze");
        miloszS.addTaskToCheck("Zadanie: Aktywni urzytkownicy");
        alaS.addTaskToCheck("Zadanie: Wyświetlamy zadania na listach zadań.");

        assertEquals(3, tomaszSkala.getUpdateCount());
        assertEquals(5, benedyktOgorek.getUpdateCount());
    }

}