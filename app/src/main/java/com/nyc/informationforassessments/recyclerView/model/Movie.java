package com.nyc.informationforassessments.recyclerView.model;

/**
 * Created by c4q on 11/20/17.
 */

public class Movie {
    String title;
    String director;
    String year;

    public Movie(String title, String director, String year) {
        this.title = title;
        this.director = director;
        this.year = year;
    }
    public String getTitle() {
        return title;
    }
    public String getDirector() {
        return director;
    }
    public String getYear() {
        return year;
    }
}
