package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class Student implements Observable{
    private final List<Observer> observers;
    private final List<String> tasksToCheck;
    private final String name;

    public Student(String name) {
        observers = new ArrayList<>();
        tasksToCheck = new ArrayList<>();
        this.name = name;
    }

    public void addTaskToCheck(String task) {
        tasksToCheck.add(task);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public List<String> getTasksToCheck() {
        return tasksToCheck;
    }

    public String getName() {
        return name;
    }

}
