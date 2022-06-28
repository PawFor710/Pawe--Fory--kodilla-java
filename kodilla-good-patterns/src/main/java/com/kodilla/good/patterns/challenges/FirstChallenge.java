package com.kodilla.good.patterns.challenges;


import java.util.stream.Collectors;

public class FirstChallenge {

    public static void main(String[] args) {

        MovieStore movieStore = new MovieStore();

        String movieList = movieStore.getMovies().entrySet().stream()
                .flatMap(titles -> titles.getValue().stream())
                .collect(Collectors.joining("! "));

        System.out.println(movieList);
    }
}
