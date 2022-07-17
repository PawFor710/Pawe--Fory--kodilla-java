package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;


public class Board {

    final TaskList toDoList;
    final TaskList inProgressList;
    final TaskList doneList;

    public Board() {
        this.toDoList = new TaskList(new ArrayList<>());
        this.inProgressList = new TaskList(new ArrayList<>());
        this.doneList = new TaskList(new ArrayList<>());
    }

    public List<String> read() {
        List<String> list = new ArrayList<>();
        list.addAll(toDoList.getTasks());
        list.addAll(inProgressList.getTasks());
        list.addAll(doneList.getTasks());
        return list;
    }

    public void addToDoList(String toDo) {
        toDoList.getTasks().add(toDo);
    }

    public void addInProgressList(String inProgress) {
        inProgressList.getTasks().add(inProgress);
    }

    public void addDoneList(String done) {
        doneList.getTasks().add(done);
    }
}
