package com.kodilla.patterns2.observer.forum;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ForumUserTestSuite {

    @Test
    public void testUpdate() {
        //Given
        ForumTopic javaHelpForum = new JavaHelpForumTopic();
        ForumTopic javaToolsForum = new JavaToolsForumTopic();
        ForumUser johnSmith = new ForumUser("John Smith");
        ForumUser juneCant = new ForumUser("June Cant");
        ForumUser gregFikalsky = new ForumUser("Greg Fikalsky");
        javaHelpForum.registerObserver(johnSmith);
        javaToolsForum.registerObserver(juneCant);
        javaToolsForum.registerObserver(gregFikalsky);
        javaHelpForum.registerObserver(gregFikalsky);

        //When
        javaHelpForum.addPost("Can you help me with for loop?");
        javaHelpForum.addPost("Maybe you should try while loop for this task");
        javaToolsForum.addPost("Anyone know how code with cat lying on my keyboard?");
        javaToolsForum.addPost("Buy new keyboard? :)");
        javaHelpForum.addPost("Is while easier to use?");

        //Then
        assertEquals(3, johnSmith.getUpdateCount());
        assertEquals(2, juneCant.getUpdateCount());
        assertEquals(5, gregFikalsky.getUpdateCount());
    }
}
