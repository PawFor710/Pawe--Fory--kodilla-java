package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {

    private final int userId;
    private final String username;
    private final char gender;
    private final LocalDate birthDate;
    private final int posts;

    public ForumUser(int userId, String username, char gender, int yearOfBirth, int monthOfYear,
                     int dayOfBirth, int posts) {
        this.userId = userId;
        this.username = username;
        this.gender = gender;
        this.birthDate = LocalDate.of(yearOfBirth, monthOfYear, dayOfBirth);
        this.posts = posts;
    }
    public int getUserId() {
        return userId;
    }
    public String getUsername() {
        return username;
    }
    public char getGender() {
        return gender;
    }
    public LocalDate getBirthDate() {
        return birthDate;
    }
    public int getPosts() {
        return posts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", gender=" + gender +
                ", birthDate=" + birthDate +
                ", posts=" + posts +
                '}';
    }
}
