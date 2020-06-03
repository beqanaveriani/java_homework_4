package com.beka.naveriani.davaleba4.entitiy;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String movieId;

    private String title;

    private String country;

    public Movie(){}

    public Movie(String title, String country){
        this.movieId = UUID.randomUUID().toString();
        this.title  = title;
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public String getTitle() {
        return title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMovieId() {
        return movieId;
    }
}
