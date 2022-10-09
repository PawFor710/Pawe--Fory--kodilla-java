package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {

    private final String mentorName;

    private int updateCount;

    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }

    @Override
    public void update(Tasks tasks) {
        System.out.println(mentorName + " received new task to check from " + tasks.getName() + "\n"
        + "Total number of tasks to be checked: " + tasks.getTasks().size() + ".");
        updateCount++;
    }

    public String getMentorName() {
        return mentorName;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
