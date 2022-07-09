package com.kodilla.testing.statistics;

public class Stats {

    double postPerUsers;
    double commentsPerUser;
    double commentsPerPost;

    public Stats(double postPerUsers, double commentsPerUser, double commentsPerPost) {
        this.postPerUsers = postPerUsers;
        this.commentsPerUser = commentsPerUser;
        this.commentsPerPost = commentsPerPost;
    }

    public double getPostPerUsers() {
        return postPerUsers;
    }

    public double getCommentsPerUser() {
        return commentsPerUser;
    }

    public double getCommentsPerPost() {
        return commentsPerPost;
    }
}
