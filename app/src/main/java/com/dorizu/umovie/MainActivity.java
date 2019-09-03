package com.dorizu.umovie;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvMovie;
    private ArrayList<Movie> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvMovie = findViewById(R.id.rv_movie);
        rvMovie.setHasFixedSize(true);

        list.addAll(MovieData.getListData());
        tampilGrid();
    }

    private void tampilGrid(){
        rvMovie.setLayoutManager(new GridLayoutManager(this, 3));
        GridMovieAdapter gridMovieAdapter = new GridMovieAdapter(this);
        gridMovieAdapter.setListMovie(list);
        rvMovie.setAdapter(gridMovieAdapter);
    }
}
