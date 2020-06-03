package com.beka.naveriani.davaleba4.service.impl;

import com.beka.naveriani.davaleba4.entitiy.Movie;
import com.beka.naveriani.davaleba4.exception.GeneralException;
import com.beka.naveriani.davaleba4.model.request.CreateMovieRequest;
import com.beka.naveriani.davaleba4.model.response.MovieResponse;
import com.beka.naveriani.davaleba4.repository.MovieRepository;
import com.beka.naveriani.davaleba4.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MovieServiceImpl implements MovieService {


    MovieRepository movieRepository;

    @Override
    public MovieResponse addMovie(CreateMovieRequest request) {
        Movie movie = new Movie(request.getTitle(), request.getCountry());
        return new MovieResponse(movieRepository.save(movie));
    }

    @Override
    public void deleteMovie(String movieId) {
        Movie movie = movieRepository.findByMovieId(movieId).orElseThrow(() -> new GeneralException("invalid.move.id", "Movie not found"));
        movieRepository.delete(movie);
    }

    @Override
    public MovieResponse getMovie(String movieId) {
        return new MovieResponse(movieRepository.findByMovieId(movieId).orElseThrow(() -> new GeneralException("invalid.move.id", "Movie not found")));
    }

    @Override
    public List<MovieResponse> getMovies() {
        return movieRepository.findAll().stream().map(MovieResponse::new).collect(Collectors.toList());
    }


    @Autowired
    public void setMovieRepository(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }
}
