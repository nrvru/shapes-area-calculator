package ru.vyatsu.tse.models;

/**
 * Класс определяющий квадрат
 * @author Ruslan Nekhoroshkin
 */
public class Square extends Shape {
    /**
     * Длина стороны квадрата
     */
    private double sideLength;

    /**
     * Конструктор класса квадрата с инициализацией длины стороны
     * @param sideLength Длина стороны квадрата
     */
    public Square(double sideLength){
        setSideLength(sideLength);
    }

    /**
     * Возвращает длину стороны квадрата
     * @return Длина стороны квадрата
     */
    public double getSideLength() {
        return sideLength;
    }

    /**
     * Устанавливает длину стороны квадрата
     * @param sideLength Новое значение длины стороны квадрата
     */
    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    /**
     * Вычисляет площадь квадрата
     * @return Площадь квадрата
     */
    @Override
    public double calculateArea() {
        return sideLength * sideLength;
    }
}
