package ru.vyatsu.tse.models;

/**
 * Класс определяющий круг
 * @author Ruslan Nekhoroshkin
 */
public class Circle extends Shape {
    /**
     * Радиус круга
     */
    private double radius;

    /**
     * Конструктор класса круга с инициализацией радиуса
     * @param radius Радиус круга
     */
    public Circle(double radius){
        setRadius(radius);
    }

    /**
     * Возвращает радиус круга
     * @return Радиус круга
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Устанавливает радиус круга
     * @param radius Новое значение радиуса круга
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Вычисляет площадь круга
     * @return Площадь круга
     */
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
