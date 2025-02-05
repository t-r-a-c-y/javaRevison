package com.mywebapp.streams;

public class Movie {
    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", likes=" + likes +
                '}';
    }

    private String name;
    private int likes;

    public int getLikes() {
        return likes;
    }

    public Movie(int likes, String name) {
        this.likes = likes;
        this.name = name;
    }

}
