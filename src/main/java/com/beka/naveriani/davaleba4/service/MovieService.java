package com.beka.naveriani.davaleba4.service;

import com.beka.naveriani.davaleba4.model.request.CreateMovieRequest;
import com.beka.naveriani.davaleba4.model.response.MovieResponse;

import java.util.List;

public interface MovieService {

    MovieResponse addMovie(CreateMovieRequest request);

    void deleteMovie(String movieId);

    MovieResponse getMovie(String movieId);

    List<MovieResponse> getMovies();
}
