package com.example.springdemo;

public class Car {
    private String brand;
    private String model;
    private int year_of_issue;
    private int mileage_in_km;
    private BodyType body_type;
    private String colour;

    public Car(String brand, String model, int year_of_issue, int mileage_in_km, BodyType body_type, String colour) {
        this.brand = brand;
        this.model = model;
        this.year_of_issue = year_of_issue;
        this.mileage_in_km = mileage_in_km;
        this.body_type = body_type;
        this.colour = colour;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear_of_issue() {
        return year_of_issue;
    }

    public void setYear_of_issue(int year_of_issue) {
        this.year_of_issue = year_of_issue;
    }

    public int getMileage_in_km() {
        return mileage_in_km;
    }

    public void setMileage_in_km(int mileage_in_km) {
        this.mileage_in_km = mileage_in_km;
    }

    public BodyType getBody_type() {
        return body_type;
    }

    public void setBody_type(BodyType body_type) {
        this.body_type = body_type;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
