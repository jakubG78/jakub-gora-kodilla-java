package com.kodilla.testing.forum.statistics;

import java.util.List;

public class ForumStatistics{

    int usersCounter;
    int postsCounter;
    int commentsCounter;
    double avrgUserPostsCounter;
    double avrgUserCommentsCounter;
    double avrgPostsCommentsCounter;

    public void calculateAdvStatistics(Statistics statistics) {

    usersCounter = 2;
    postsCounter = 2;
    commentsCounter = 2;
    avrgUserPostsCounter = 2;
    avrgUserCommentsCounter = 2;
    avrgPostsCommentsCounter = 2;

    }

    public void showStatistics() {
        System.out.println("Forum statistics");
        System.out.println("Users: " + usersCounter);
        System.out.println("Post: " + postsCounter);
        System.out.println("Comments: " + commentsCounter);
        System.out.println("Average post per user: " + avrgUserPostsCounter);
        System.out.println("Average comment per user: " + avrgUserCommentsCounter);
        System.out.println("Average comment per post: " + avrgPostsCommentsCounter);
    }
}