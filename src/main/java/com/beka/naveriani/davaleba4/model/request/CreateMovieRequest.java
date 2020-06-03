package com.beka.naveriani.davaleba4.model.request;

public class CreateMovieRequest {

    private String title;

    private String country;

    public String getTitle() {
        return title;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
