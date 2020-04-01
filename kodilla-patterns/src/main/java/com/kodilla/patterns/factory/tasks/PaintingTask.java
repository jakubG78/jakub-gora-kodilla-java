package com.kodilla.patterns.factory.tasks;

public final class PaintingTask implements Task {

    final String taskName;
    final String color;
    final String whatToPaint;

    public PaintingTask(final String taskName, final String color, final String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public String executeTask() {
        return "Painting " + whatToPaint + " " + color + ".";
    }

    @Override
    public boolean isTaskExecuted() {
        return whatToPaint != null && color != null;
    }
}
