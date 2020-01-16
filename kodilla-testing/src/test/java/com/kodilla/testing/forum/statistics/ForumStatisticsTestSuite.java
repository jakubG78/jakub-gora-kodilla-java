package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.forum.ForumUser;
import com.kodilla.testing.weather.stub.Temperatures;
import org.junit.*;

import java.util.HashMap;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests(){
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTest(){
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest(){
        testCounter++;
        System.out.println("Preparing to execute test #"+testCounter);
    }

    @Test
    public void testUsersNames(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> currentUsersNames = new List<String>;
        currentUsersNames.add("john");
        when(statisticsMock.usersNames()).thenReturn(currentUsersNames);
        //When
        List<String> retrievedUserNames  = forumStatistics.usersNames()
        //Then
        Assert.assertEquals(retrievedUserNames,currentUsersNames);
    }
}
