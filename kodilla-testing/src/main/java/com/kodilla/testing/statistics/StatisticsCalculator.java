package com.kodilla.testing.statistics;

import java.util.ArrayList;
import java.util.List;

public class StatisticsCalculator {

    double postsPerUser = 0;
    double commentsPerUser = 0;
    double commentsPerPost = 0;

    public double getPostsPerUser() {
        return postsPerUser;
    }
    public double getCommentsPerUser() {
        return commentsPerUser;
    }
    public double getCommentsPerPost() {
        return commentsPerPost;
    }
    public void calculateAdvStatistics(Statistics statistics) {

        List<String> users = new ArrayList<>();
        users.size();

        List<String> comments = new ArrayList<>();
        comments.size();

        List<String> posts = new ArrayList<>();
        posts.size();

        postsPerUser = posts.size() / users.size();
        commentsPerUser = comments.size() / users.size();
        commentsPerPost = comments.size() / posts.size();
    }

}
