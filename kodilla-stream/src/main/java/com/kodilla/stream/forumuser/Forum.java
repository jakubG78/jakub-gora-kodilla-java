package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> theForumUser = new ArrayList<>();

    public Forum() {
        theForumUser.add(new ForumUser(1,"jSmith",'M', LocalDate.of(2001,12,06),586));
        theForumUser.add(new ForumUser(2,"jGoodall",'F',LocalDate.of(1934,04,03),0));
        theForumUser.add(new ForumUser(3,"łPieczonka",'M',LocalDate.of(1978,07,12),51));
        theForumUser.add(new ForumUser(5,"kAbdul-Jabbar",'M',LocalDate.of(1947,04,16),37));
        theForumUser.add(new ForumUser(6,"cOakley",'M',LocalDate.of(1999,12,18),19));
        theForumUser.add(new ForumUser(7,"uKroeber",'F',LocalDate.of(2000,10,21),681));
        theForumUser.add(new ForumUser(7,"bBorder",'M',LocalDate.of(2000,01,20),5));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(theForumUser);
    }
}
