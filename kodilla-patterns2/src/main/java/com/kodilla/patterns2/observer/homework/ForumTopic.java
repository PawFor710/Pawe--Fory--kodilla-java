package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class ForumTopic {

    private final List<Observer> observers;

    private final List<String> messages;

    private final String name;

    public ForumTopic(String name) {
        observers = new ArrayList<>();
        messages = new ArrayList<>();
        this.name = name;
    }

    public void addDoneExercises(String exercise) {

    }
}
