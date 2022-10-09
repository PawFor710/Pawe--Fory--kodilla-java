package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class Tasks implements Observable {

    private final List<Observer> observers;

    private final List<String> tasks;

    private final String name;




    public Tasks(String name) {
        observers = new ArrayList<>();
        tasks = new ArrayList<>();
        this.name = name;
    }

    public void addDoneExercises(String exercise) {
        tasks.add(exercise);
        notifyObserver();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    public List<String> getTasks() {
        return tasks;
    }

    public String getName() {
        return name;
    }
}
