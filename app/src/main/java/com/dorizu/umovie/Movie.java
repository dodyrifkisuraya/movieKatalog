package com.dorizu.umovie;

import android.os.Parcel;
import android.os.Parcelable;

public class Movie implements Parcelable {
    private String judul;
    private String tanggalRilis;
    private String overview;
    private String durasi;
    private String bahasa;
    private String director;
    private String genre;
    private String thunail;


    protected Movie(Parcel in) {
        judul = in.readString();
        tanggalRilis = in.readString();
        overview = in.readString();
        durasi = in.readString();
        bahasa = in.readString();
        director = in.readString();
        genre = in.readString();
        thunail = in.readString();
    }

    public Movie() {

    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(judul);
        dest.writeString(tanggalRilis);
        dest.writeString(overview);
        dest.writeString(durasi);
        dest.writeString(bahasa);
        dest.writeString(director);
        dest.writeString(genre);
        dest.writeString(thunail);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Movie> CREATOR = new Creator<Movie>() {
        @Override
        public Movie createFromParcel(Parcel in) {
            return new Movie(in);
        }

        @Override
        public Movie[] newArray(int size) {
            return new Movie[size];
        }
    };

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getTanggalRilis() {
        return tanggalRilis;
    }

    public void setTanggalRilis(String tanggalRilis) {
        this.tanggalRilis = tanggalRilis;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getDurasi() {
        return durasi;
    }

    public void setDurasi(String durasi) {
        this.durasi = durasi;
    }

    public String getBahasa() {
        return bahasa;
    }

    public void setBahasa(String bahasa) {
        this.bahasa = bahasa;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getThunail() {
        return thunail;
    }

    public void setThunail(String thunail) {
        this.thunail = thunail;
    }

    public static Creator<Movie> getCREATOR() {
        return CREATOR;
    }
}
