package ru.vyatsu.tse.models;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height){
        setWidth(width);
        setHeight(height);
    }

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
    public double calculateArea() {
        return width * height;
    }
}
