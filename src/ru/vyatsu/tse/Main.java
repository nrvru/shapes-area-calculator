package ru.vyatsu.tse;

/**
 * Класс запуска приложения (начальная точка входа)
 * @author Ruslan Nekhoroshkin
 */
public class Main {

    /**
     * Метод для точки входа приложения
     * @param args Список параметров командной строки с которыми приложение было запущено
     */
    public static void main(String[] args) {
        CalculateShapesAreaApp app = new CalculateShapesAreaApp();
        app.start();
    }

}
