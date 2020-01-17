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

        usersCounter = statistics.usersNames().size();
        postsCounter = statistics.postsCount();
        commentsCounter = statistics.commentsCount();

        if (usersCounter != 0) {
            avrgUserPostsCounter = postsCounter / usersCounter;
            avrgUserCommentsCounter = commentsCounter / usersCounter;
        } else {
            avrgUserPostsCounter = 0;
            avrgUserCommentsCounter = 0;
        }
        if(postsCounter != 0){
            avrgPostsCommentsCounter = commentsCounter / postsCounter;
        }else {
            avrgPostsCommentsCounter = 0;
        }
    }
}