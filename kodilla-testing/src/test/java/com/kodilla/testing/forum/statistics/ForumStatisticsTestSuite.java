package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.forum.ForumUser;
import com.kodilla.testing.weather.stub.Temperatures;
import org.junit.*;

import java.util.*;

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
    public void testUsersCount(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> currentUserNames = new ArrayList<String>();
        for(int n = 0; n < 100; n++) {
            currentUserNames.add("john"+n);
        }
        when(statisticsMock.usersNames()).thenReturn(currentUserNames);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        int result = forumStatistics.usersCounter;
        //Then
        Assert.assertEquals(100, result);
    }
    @Test
    public void testUsers0Count(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> currentUserNames = new ArrayList<String>();
        when(statisticsMock.usersNames()).thenReturn(currentUserNames);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        int result = forumStatistics.usersCounter;
        //Then
        Assert.assertEquals(0, result);
    }
    @Test
    public void testPostCount(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();
        when(statisticsMock.postsCount()).thenReturn(100);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        int result = forumStatistics.postsCounter;
        //Then
        Assert.assertEquals(100, result);
    }
    @Test
    public void testPost0Count(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();
        when(statisticsMock.postsCount()).thenReturn(0);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        int result = forumStatistics.postsCounter;
        //Then
        Assert.assertEquals(0, result);
    }
    @Test
    public void testCommentsCount(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();
        when(statisticsMock.commentsCount()).thenReturn(100);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        int result = forumStatistics.commentsCounter;
        //Then
        Assert.assertEquals(100, result);
    }
    @Test
    public void testComments0Count(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();
        when(statisticsMock.commentsCount()).thenReturn(0);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        int result = forumStatistics.commentsCounter;
        //Then
        Assert.assertEquals(0, result);
    }
    @Test
    public void testAvrg100100100(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> currentUserNames = new ArrayList<String>();
        for(int n = 0; n < 100; n++) {
            currentUserNames.add("john"+n);
        }
        when(statisticsMock.usersNames()).thenReturn(currentUserNames);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(100);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        double resultPost = forumStatistics.avrgUserPostsCounter;
        double resultComments = forumStatistics.avrgUserCommentsCounter;
        double resultPostComments = forumStatistics.avrgPostsCommentsCounter;
        //Then
        Assert.assertEquals(1, resultPost);
        Assert.assertEquals(1, resultComments);
        Assert.assertEquals(1, resultPostComments);
    }
    @Test
    public void testAvrg0100100(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> currentUserNames = new ArrayList<String>();
        when(statisticsMock.usersNames()).thenReturn(currentUserNames);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(100);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        double resultPost = forumStatistics.avrgUserPostsCounter;
        double resultComments = forumStatistics.avrgUserCommentsCounter;
        double resultPostComments = forumStatistics.avrgPostsCommentsCounter;
        //Then
        Assert.assertEquals(0, resultPost);
        Assert.assertEquals(0, resultComments);
        Assert.assertEquals(1, resultPostComments);
    }
    @Test
    public void testAvrg00100(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> currentUserNames = new ArrayList<String>();
        when(statisticsMock.usersNames()).thenReturn(currentUserNames);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(100);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        double resultPost = forumStatistics.avrgUserPostsCounter;
        double resultComments = forumStatistics.avrgUserCommentsCounter;
        double resultPostComments = forumStatistics.avrgPostsCommentsCounter;
        //Then
        Assert.assertEquals(0, resultPost);
        Assert.assertEquals(0, resultComments);
        Assert.assertEquals(0, resultPostComments);
    }
    @Test
    public void testAvrg000(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> currentUserNames = new ArrayList<String>();
        when(statisticsMock.usersNames()).thenReturn(currentUserNames);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        double resultPost = forumStatistics.avrgUserPostsCounter;
        double resultComments = forumStatistics.avrgUserCommentsCounter;
        double resultPostComments = forumStatistics.avrgPostsCommentsCounter;
        //Then
        Assert.assertEquals(0, resultPost);
        Assert.assertEquals(0, resultComments);
        Assert.assertEquals(0, resultPostComments);
    }
    @Test
    public void testAvrg10000(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> currentUserNames = new ArrayList<String>();
        for(int n = 0; n < 100; n++) {
            currentUserNames.add("john"+n);
        }
        when(statisticsMock.usersNames()).thenReturn(currentUserNames);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        double resultPost = forumStatistics.avrgUserPostsCounter;
        double resultComments = forumStatistics.avrgUserCommentsCounter;
        double resultPostComments = forumStatistics.avrgPostsCommentsCounter;
        //Then
        Assert.assertEquals(0, resultPost);
        Assert.assertEquals(0, resultComments);
        Assert.assertEquals(0, resultPostComments);
    }
    @Test
    public void testAvrg1001000(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> currentUserNames = new ArrayList<String>();
        for(int n = 0; n < 100; n++) {
            currentUserNames.add("john"+n);
        }
        when(statisticsMock.usersNames()).thenReturn(currentUserNames);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(0);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        double resultPost = forumStatistics.avrgUserPostsCounter;
        double resultComments = forumStatistics.avrgUserCommentsCounter;
        double resultPostComments = forumStatistics.avrgPostsCommentsCounter;
        //Then
        Assert.assertEquals(1, resultPost);
        Assert.assertEquals(0, resultComments);
        Assert.assertEquals(0, resultPostComments);
    }
    @Test
    public void testAvrg1000100(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> currentUserNames = new ArrayList<String>();
        for(int n = 0; n < 100; n++) {
            currentUserNames.add("john"+n);
        }
        when(statisticsMock.usersNames()).thenReturn(currentUserNames);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(100);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        double resultPost = forumStatistics.avrgUserPostsCounter;
        double resultComments = forumStatistics.avrgUserCommentsCounter;
        double resultPostComments = forumStatistics.avrgPostsCommentsCounter;
        //Then
        Assert.assertEquals(0, resultPost);
        Assert.assertEquals(1, resultComments);
        Assert.assertEquals(0, resultPostComments);
    }
    @Test
    public void testAvrg01000(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> currentUserNames = new ArrayList<String>();
        when(statisticsMock.usersNames()).thenReturn(currentUserNames);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(100);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        double resultPost = forumStatistics.avrgUserPostsCounter;
        double resultComments = forumStatistics.avrgUserCommentsCounter;
        double resultPostComments = forumStatistics.avrgPostsCommentsCounter;
        //Then
        Assert.assertEquals(0, resultPost);
        Assert.assertEquals(0, resultComments);
        Assert.assertEquals(0, resultPostComments);
    }
}