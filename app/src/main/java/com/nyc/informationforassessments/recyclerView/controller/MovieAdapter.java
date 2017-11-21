package com.nyc.informationforassessments.recyclerView.controller;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nyc.informationforassessments.R;
import com.nyc.informationforassessments.recyclerView.model.Movie;
import com.nyc.informationforassessments.recyclerView.view.MovieViewHolder;

import java.util.List;

public class MovieAdapter extends RecyclerView.Adapter<MovieViewHolder>{

    private List<Movie> movieList;

    public MovieAdapter(List<Movie> movieList) {
        this.movieList = movieList;
    }

    @Override
    public MovieViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View childView = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemview, parent, false);
        return new MovieViewHolder(childView);
    }

    /**
     *
     * @param holder
     * @param position
     * This is the place to get each item individually
     */
    @Override
    public void onBindViewHolder(MovieViewHolder holder, int position) {
        Movie movie = movieList.get(position);
        holder.onBind(movie);
    }

    @Override
    public int getItemCount() {
        return movieList.size();
    }
}
