package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class StudenHomeworkQueue implements Observable {

    private final List<Observer> mentors;
    private final Queue<String> tasks;
    private final String studentsName;

    public StudenHomeworkQueue(String studentsName) {
        mentors = new ArrayList<>();
        tasks = new ArrayDeque<>();
        this.studentsName = studentsName;
    }

    public void addTask(String task) {
        tasks.offer(task);
        notifyMentors();
    }

    @Override
    public void registerMentor(Observer observer) {
        mentors.add(observer);
    }

    @Override
    public void notifyMentors() {
        for (Observer observer : mentors) {
            observer.newTaskUpdate(this);
        }
    }

    @Override
    public void removeMentor(Observer observer) {
        mentors.remove(observer);
    }

    public Queue<String> getTasks() {
        return tasks;
    }

    public String getStudentsName() {
        return studentsName;
    }
}
