package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {

    public static final String DRIVING = "DRIVING";
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";

    public Task makeTask(final String taskType) {
        switch (taskType) {
            case DRIVING:
                return new DrivingTask("Drive home", "home", "my car");
            case SHOPPING:
                return new ShoppingTask("Buy car tires", "tires", 4.0);
            case PAINTING:
                return new PaintingTask("Paint bedroom", "white", "bedroom");
            default:
                return null;
        }
    }
}
