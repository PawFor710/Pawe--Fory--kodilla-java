package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {

    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task doTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("Shopping in local store", "Watermelons", 5);
            case PAINTING:
                return new PaintingTask("Painting my bedroom", "White", "North wall");
            case DRIVING:
                return new DrivingTask("Driving home", "Mother's house", "Car");
            default:
                return null;
        }
    }
}
