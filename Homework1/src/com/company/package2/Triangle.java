package com.company.package2;

public class Triangle implements AreaPerimeterCountable{
    private double sideA;
    private double sideB;
    private double sideC;

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    @Override
    public double calculatePerimeter() {
        return this.sideA+this.sideB+this.sideC;
    }

    @Override
    public double calculateArea() {
        double halfPerimeter = this.calculatePerimeter()/2;
        return Math.sqrt(halfPerimeter*(halfPerimeter-sideA)*(halfPerimeter-this.sideB)*(halfPerimeter-this.sideC));
    }
}
