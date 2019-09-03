package com.dorizu.umovie;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class GridMovieAdapter extends RecyclerView.Adapter<GridMovieAdapter.GridViewHolder> {

    private ArrayList<Movie> listMovie;
    private Context context;

    public GridMovieAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<Movie> getListMovie() {
        return listMovie;
    }

    public void setListMovie(ArrayList<Movie> listMovie) {
        this.listMovie = listMovie;
    }

    @NonNull
    @Override
    public GridViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_movie, viewGroup, false);
        return new GridViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GridViewHolder holder, int i) {
        final Movie objekMovie = getListMovie().get(i);
        Glide.with(context)
                .load(objekMovie.getThunail())
                .apply(new RequestOptions().override(350,550))
                .into(holder.thumnail);
        holder.title.setText(objekMovie.getJudul());
        holder.movie = objekMovie;
    }

    @Override
    public int getItemCount() {
        return listMovie.size();
    }

    public class GridViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView thumnail;
        TextView title;
        Movie movie;
        CardView itemCard;

        public GridViewHolder(@NonNull View itemView) {
            super(itemView);
            thumnail = itemView.findViewById(R.id.img_thumnail);
            title = itemView.findViewById(R.id.title_movie);
            itemCard = itemView.findViewById(R.id.itemCard);
            itemCard.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            Intent bawaData = new Intent(context, DetailMovie.class);
            bawaData.putExtra("key", movie);
            context.startActivity(bawaData);
        }
    }
}
