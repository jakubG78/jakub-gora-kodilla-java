package com.kodilla.good.patterns.challenges;

import java.util.stream.Collectors;

public class MovieStoreStream {

    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();

        String resultMovieString = movieStore.getMovies().entrySet().stream()
                .map(entry -> entry.getValue())
                .flatMap(entry -> entry.stream())
                .collect(Collectors.joining("!"));

        System.out.println(resultMovieString);
    }

}
