package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {

    private final String username;
    private int updateCount;

    public Mentor(String username) {
        this.username = username;
    }

    @Override
    public void update(Student student) {
        System.out.println("Informacja dla " + username + " Student " + student.getName() + " przeslal nowe zadanie do sprawdzenia. " +
                student.getTasksToCheck().get(student.getTasksToCheck().size() - 1));
        updateCount++;
    }

    public String getUsername() {
        return username;
    }

    public int getUpdateCount() {
        return updateCount;
    }

}
