package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {

    @BeforeClass
    public static void addLog() {
        Logger.getInstance().log("log.last");
    }

    @Test
    public void testGetLastLog(){
        //Given
        //When
        String lastLog = Logger.getInstance().getLastLog();
        System.out.println("Last log name is: "+ lastLog);
        //Then
        Assert.assertEquals("log.last", lastLog);
    }
}
