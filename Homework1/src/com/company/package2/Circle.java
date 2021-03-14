package com.company.package2;

public class Circle implements AreaPerimeterCountable{
    double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2*Math.PI*this.getRadius();
    }

    public double calculateArea()
    {
        return Math.PI*Math.pow(this.getRadius(),2);
    }
}
