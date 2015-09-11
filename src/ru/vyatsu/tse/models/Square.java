package ru.vyatsu.tse.models;

public class Square extends Shape {
    private double sideLength;

    public Square(double sideLength){
        setSideLength(sideLength);
    }

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double calculateArea() {
        return sideLength * sideLength;
    }
}
