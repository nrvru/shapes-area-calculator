package ru.vyatsu.tse.models;

/**
 * Класс определяющий прямоугольник
 * @author Ruslan Nekhoroshkin
 */
public class Rectangle extends Shape {
    /**
     * Ширина прямоугольника
     */
    private double width;

    /**
     * Высота прямоугольника
     */
    private double height;

    /**
     * Конструктор класса прямоугольника с инициализацией длины и высоты
     * @param width Ширина прямоугольника
     * @param height Высота прямоугольника
     */
    public Rectangle(double width, double height){
        setWidth(width);
        setHeight(height);
    }

    /**
     * Возвращает высоту прямоугольника
     * @return Высота прямоугольника
     */
    public double getHeight() {
        return height;
    }

    /**
     * Устанавливает высоту прямоугольника
     * @param height Новое значение высоты прямоугольника
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Возвращает ширину прямоугольника
     * @return Ширина прямоугольника
     */
    public double getWidth() {
        return width;
    }

    /**
     * Устанавливает ширину прямоугольника
     * @param width Новое значение ширины прямоугольника
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * Вычисляет площадь прямоугольника
     * @return Площадь прямоугольника
     */
    @Override
    public double calculateArea() {
        return width * height;
    }
}
