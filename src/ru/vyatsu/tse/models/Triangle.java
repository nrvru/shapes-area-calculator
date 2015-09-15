package ru.vyatsu.tse.models;

/**
 * Класс определяющий тругольник
 * @author Ruslan Nekhoroshkin
 */
public class Triangle extends Shape {
    /**
     * Длина основания тругольника
     */
    private double sideLength;

    /**
     * Высота тругольника
     */
    private double heightLength;

    /**
     * Конструктор класса треугольника с инициализацией длины основания и высоты
     * @param sideLength Длина основания тругольника
     * @param heightLength Высота тругольника
     */
    private Triangle(double sideLength, double heightLength) {
        setSideLength(sideLength);
        setHeightLength(heightLength);
    }

    /**
     * Возвращает длину основания тругольника
     * @return Длина основания тругольника
     */
    public double getSideLength() {
        return sideLength;
    }

    /**
     * Устанавливает длину основания тругольника
     * @param sideLength Новое значение длины основания тругольника
     */
    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    /**
     * Возвращает высоту тругольника
     * @return Высота тругольника
     */
    public double getHeightLength() {
        return heightLength;
    }

    /**
     * Устанавливает высоту тругольника
     * @param heightLength Новое значение высоты тругольника
     */
    public void setHeightLength(double heightLength) {
        this.heightLength = heightLength;
    }

    /**
     * Вычисляет площадь тругольника
     * @return Площадь тругольника
     */
    @Override
    public double calculateArea() {
        return 0.5 * sideLength * heightLength;
    }
}
