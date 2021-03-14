package com.company.package2;

public class Movie {
    private String title;
    private double rating;

    public Movie(String title, double rating) {
        this.setTitle(title);
        this.setRating(rating);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
