package com.kodilla.testing.statistics;

import java.util.ArrayList;
import java.util.List;

public class StatisticsCalculator {


    List<String> users = new ArrayList<>();
    List<String> comments = new ArrayList<>();
    List<String> posts = new ArrayList<>();

    public StatisticsCalculator(List<String> users, List<String> comments, List<String> posts) {
        this.users = users;
        this.comments = comments;
        this.posts = posts;
    }

    public int postCount() {
        return posts.size();
    }
    public int commentsCount() {
        return comments.size();
    }

    public int usersCount() {
        return users.size();
    }

    public Stats calculateAdvStatistics(Statistics statistics) {
        double postsPerUser = postCount() / (double) usersCount();
        double commentsPerUser = commentsCount() / (double) usersCount();
        double commentsPerPost = commentsCount() / (double) postCount();

        return new Stats(postsPerUser, commentsPerUser, commentsPerPost);
    }
}
