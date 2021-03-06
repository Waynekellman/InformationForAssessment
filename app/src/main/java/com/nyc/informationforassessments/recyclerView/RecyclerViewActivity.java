package com.nyc.informationforassessments.recyclerView;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.nyc.informationforassessments.R;
import com.nyc.informationforassessments.recyclerView.controller.MovieAdapter;
import com.nyc.informationforassessments.recyclerView.model.Movie;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        RecyclerView movieRecyclerView = (RecyclerView) findViewById(R.id.movie_recyclerview);

        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Jaws", "Steven Spielberg", "1975"));
        movies.add(new Movie("Star Wars", "George Lucas", "1977"));
        movies.add(new Movie("Iron Man", "Jon Favreau", "2007"));
        movies.add(new Movie("The Avengers", "Joss Whedon","2011"));
        movies.add(new Movie("28 Days Later", "Danny Boyle", "2002"));
        movies.add(new Movie("Guardians of the Galaxy", "James Gunn", "2014"));
        movies.add(new Movie("Sneakers", "Phil Alden Robinson", "1992"));
        movies.add(new Movie("Clear and Present Danger", "Phillip Noyce", "1994"));
        MovieAdapter movieAdapter = new MovieAdapter(movies);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);
        movieRecyclerView.setAdapter(movieAdapter);
        movieRecyclerView.setLayoutManager(linearLayoutManager);

    }
}
