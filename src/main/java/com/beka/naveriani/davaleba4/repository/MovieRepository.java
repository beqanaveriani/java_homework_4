package com.beka.naveriani.davaleba4.repository;

import com.beka.naveriani.davaleba4.entitiy.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MovieRepository extends JpaRepository<Movie, Long> {

    Optional<Movie> findByMovieId(String movieId);

}
