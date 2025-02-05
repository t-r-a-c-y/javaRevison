package com.mywebapp.streams;

import java.util.List;

public class StreamsDemo {
    public static void main(String[] args) {
        List<Movie> movies = List.of(
                new Movie(10,"hello"),
                new Movie(20,"world"),
                new Movie(30,"likes")
        );;

        for(Movie movie : movies) {
            int count =0;
            if(movie.getLikes() > 10) {
                count++;
            }
            System.out.println(count+""+movie);
        }
        System.out.println(Thread.activeCount());
        System.out.println(Runtime.getRuntime().availableProcessors());
    }
}
