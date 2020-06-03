package com.beka.naveriani.davaleba4.controller;

import com.beka.naveriani.davaleba4.model.request.CreateMovieRequest;
import com.beka.naveriani.davaleba4.model.response.MovieResponse;
import com.beka.naveriani.davaleba4.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/movie")
public class MovieController {


    MovieService movieService;

    @PostMapping
    public MovieResponse addMovie(@RequestBody CreateMovieRequest request){
        return movieService.addMovie(request);
    }

    @DeleteMapping(path = "/{movieId}")
    public void deleteMovie(@PathVariable("movieId") String movieId){
        movieService.deleteMovie(movieId);
    }

    @GetMapping(path = "/{movieId}")
    public MovieResponse getMovie(@PathVariable("movieId") String movieId){
        return movieService.getMovie(movieId);
    }

    @GetMapping(path = "/all")
    public List<MovieResponse> getMovies(){
        return movieService.getMovies();
    }


    @Autowired
    public void setMovieService(MovieService movieService) {
        this.movieService = movieService;
    }
}
