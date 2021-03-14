package com.company.package2;

public class Rectangle implements AreaPerimeterCountable{
    private double height;
    private double width;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double calculatePerimeter() {
        return 2*(this.getHeight()+this.getWidth());
    }

    @Override
    public double calculateArea() {
        return this.getHeight()*this.getWidth();
    }
}
