package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {

    List<ForumUser> forumUsers = new ArrayList<>();

    public Forum() {
        forumUsers.add(new ForumUser(001, "mrsmith", 'M',
                2010, 5, 20, 5));
        forumUsers.add(new ForumUser(002, "mrsbrown", 'F',
                1980, 1, 11, 0));
        forumUsers.add(new ForumUser(003, "mrsdavis", 'F',
                2000, 12, 5, 2));
        forumUsers.add(new ForumUser(004, "mrmiller", 'M',
                1989, 6, 15, 0));
        forumUsers.add(new ForumUser(005, "mrwilson", 'M',
                1985, 10, 5, 3));
    }

    public List<ForumUser> getUsersList() {
        return new ArrayList<>(forumUsers);
    }
}
