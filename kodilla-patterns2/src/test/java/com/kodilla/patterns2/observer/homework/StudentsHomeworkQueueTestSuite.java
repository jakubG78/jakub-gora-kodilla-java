package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudentsHomeworkQueueTestSuite {

    @Test
    public void testTaskUpdate(){
        //Given
        StudenHomeworkQueue andrewHomeworkQueue = new AndrewHomeworkQueue();
        StudenHomeworkQueue dinkHomeworkQueue = new DinkHomeworkQueue();
        StudenHomeworkQueue martinHomeworkQueue = new MartinHomeworkQueue();
        StudenHomeworkQueue paulHomeworkQueue = new PaulHomeworkQueue();
        StudenHomeworkQueue petrawHomeworkQueue = new PetraHomeworkQueue();
        Mentor hyrumGraff = new Mentor("Hyrum Graff");
        Mentor mazerRackham = new Mentor("Mazer Rackham");
        andrewHomeworkQueue.registerMentor(hyrumGraff);
        andrewHomeworkQueue.registerMentor(mazerRackham);
        dinkHomeworkQueue.registerMentor(hyrumGraff);
        martinHomeworkQueue.registerMentor(mazerRackham);
        paulHomeworkQueue.registerMentor(mazerRackham);
        petrawHomeworkQueue.registerMentor(hyrumGraff);
        petrawHomeworkQueue.registerMentor(mazerRackham);

        //When
        andrewHomeworkQueue.addTask("Learn basic 3D combat tactics");
        andrewHomeworkQueue.addTask("Logistics in large fleet operations");
        andrewHomeworkQueue.addTask("Learn advanced strategic weapon system usage - M.D. Device");
        dinkHomeworkQueue.addTask("Learn basic 3D combat tactics");
        dinkHomeworkQueue.addTask("Learn advanced 3D combat tactics");
        martinHomeworkQueue.addTask("Learn psychological aspects of combat exhaustion");
        martinHomeworkQueue.addTask("Learn advanced EEG diagnostics");
        paulHomeworkQueue.addTask("Learn combat stress reduction tactics");
        petrawHomeworkQueue.addTask("Learn basic 3D combat tactic rules");
        petrawHomeworkQueue.addTask("Logistics in large fleet operations");
        petrawHomeworkQueue.addTask("Learn advanced 3D combat tactics");

        //Then
        assertEquals(8, hyrumGraff.getTasksUpdateCount());
        assertEquals(9, mazerRackham.getTasksUpdateCount());
    }
}
