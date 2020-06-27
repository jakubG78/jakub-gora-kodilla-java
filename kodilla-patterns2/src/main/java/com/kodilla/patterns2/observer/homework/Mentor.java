package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private String mentorName;
    private int tasksUpdateCount;

    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }

    @Override
    public void newTaskUpdate (StudenHomeworkQueue studenHomeworkQueue){
        System.out.println(mentorName + ": New task in " + studenHomeworkQueue.getStudentsName() + "task queue " + "\n" +
                "(total: " + studenHomeworkQueue.getTasks().size() + " task in queue)" );
        tasksUpdateCount++;
    }

    public String getMentorName() {
        return mentorName;
    }

    public int getTasksUpdateCount() {
        return tasksUpdateCount;
    }
}

