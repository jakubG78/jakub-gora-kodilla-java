package com.kodilla.testing.forum.statistics;

import java.util.List;

public class ForumStatistics implements Statistics{

    int usersCounter;
    int postCounter;
    int commentCounter;
    List<String> listOfUsrNames;
    double avrgUserPostsCounter;
    double avrgUserCommentCounter;
    double avrgPostCommentCounter;

    public int getUsersCounter() {
        return usersCounter;
    }

    public int getPostCounter() {
        return postCounter;
    }

    public int getCommentCounter() {
        return commentCounter;
    }

    public List<String> getListOfUsrNames() {
        return listOfUsrNames;
    }

    public double getAvrgUserPostsCounter() {
        return avrgUserPostsCounter;
    }

    public double getAvrgUserCommentCounter() {
        return avrgUserCommentCounter;
    }

    public double getAvrgPostCommentCounter() {
        return avrgPostCommentCounter;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        @Override
        public List<String> usersNames() {
            return null;
        }

        @Override
        public int postsCount(){
            return 0;
        }

        @Override
        public int commentsCount(){
            return 0;
        }

        int usersCount(){
            return 0;
        }

        double avrgUserPosts(){
            return 0;
        }

        double avrgUserComments(){
            return 0;
        }

        double avrgPostComments(){
            return 0;
        }
        listOfUsrNames = usersNames();
        usersCounter = listOfUsrNames.size();
        postCounter = postsCount;
        commentCounter = commentsCount;
        avrgUserPostsCounter = avrgUserPosts();
        avrgUserCommentCounter = avrgUserComments();
        avrgPostCommentCounter = avrgPostComments();
    }

    public void showStatistics() {
        System.out.println("Forum statistics");
        System.out.println("Users: " + usersCounter);
        System.out.println("Post: " + postCounter);
        System.out.println("Comments: " + commentCounter);
        System.out.println("Average post per user: " + avrgUserPostsCounter);
        System.out.println("Average comment per user: " + avrgUserCommentCounter);
        System.out.println("Average comment per post: " + avrgPostCommentCounter);
    }
}