package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryDrivingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task drivingTask = taskFactory.makeTask(TaskFactory.DRIVING);

        //Then
        System.out.println(drivingTask.executeTask());
        Assert.assertEquals("Drive home", drivingTask.getTaskName());
        Assert.assertEquals(true, drivingTask.isTaskExecuted());
    }

    @Test
    public void testFactoryPaintingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task paintingTask = taskFactory.makeTask(TaskFactory.PAINTING);

        //Then
        System.out.println(paintingTask.executeTask());
        Assert.assertEquals("Paint bedroom", paintingTask.getTaskName());
        Assert.assertEquals(true, paintingTask.isTaskExecuted());
    }

    @Test
    public void testFactoryShoppingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task shoppingTask = taskFactory.makeTask(TaskFactory.SHOPPING);

        //Then
        System.out.println(shoppingTask.executeTask());
        Assert.assertEquals("Buy car tires", shoppingTask.getTaskName());
        Assert.assertEquals(true, shoppingTask.isTaskExecuted());
    }

}
