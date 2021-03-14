package com.company.package2;

public class Point {
    private int coordinateX;
    private int coordinateY;

    public int getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(int coordinateX) {
        this.coordinateX = coordinateX;
    }

    public int getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(int coordinateY) {
        this.coordinateY = coordinateY;
    }
    public double distance()
    {
        return Math.sqrt(Math.pow(this.coordinateX,2)+Math.pow(this.coordinateY,2));
    }
    public double distance(Point point)
    {
        return Math.sqrt(Math.pow(point.getCoordinateX()-this.coordinateX,2)+Math.pow(point.getCoordinateY() - this.coordinateY,2));
    }
}
