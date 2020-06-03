package com.beka.naveriani.davaleba4.model.response;

import com.beka.naveriani.davaleba4.entitiy.Movie;

public class MovieResponse {

    private String movieId;

    private String title;

    private String country;

    public MovieResponse(Movie movie){
        this.movieId  = movie.getMovieId();
        this.title = movie.getTitle();
        this.country = movie.getCountry();
    }

    public String getMovieId() {
        return movieId;
    }

    public String getCountry() {
        return country;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }
}
