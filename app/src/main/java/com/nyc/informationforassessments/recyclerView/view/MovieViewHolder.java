package com.nyc.informationforassessments.recyclerView.view;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.nyc.informationforassessments.R;
import com.nyc.informationforassessments.recyclerView.model.Movie;

public class MovieViewHolder extends RecyclerView.ViewHolder{

    private TextView title;
    private TextView director;
    private TextView year;

    public MovieViewHolder(View itemView) {
        super(itemView);
        title = (TextView) itemView.findViewById(R.id.movie_title_textview);
        director = (TextView) itemView.findViewById(R.id.movie_director_textview);
        year = (TextView) itemView.findViewById(R.id.movie_year_textview);
    }

    public void onBind(Movie movie) {
        title.setText("Title: " + movie.getTitle());
        director.setText("Director: " + movie.getDirector());
        year.setText("Year: " + movie.getYear());
    }
}
