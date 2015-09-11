package ru.vyatsu.tse.models;

public class Triangle extends Shape {
    private double sideLength;
    private double heightLength;

    private Triangle(double sideLength, double heightLength) {
        setSideLength(sideLength);
        setHeightLength(heightLength);
    }

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    public double getHeightLength() {
        return heightLength;
    }

    public void setHeightLength(double heightLength) {
        this.heightLength = heightLength;
    }

    @Override
    public double calculateArea() {
        return 0.5 * sideLength * heightLength;
    }
}
