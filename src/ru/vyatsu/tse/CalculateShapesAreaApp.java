package ru.vyatsu.tse;

import ru.vyatsu.tse.models.Circle;
import ru.vyatsu.tse.models.Rectangle;
import ru.vyatsu.tse.models.Square;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Основной класс приложения. Определяет структури приложения и переходы между меню.
 * @author Ruslan Nekhoroshkin
 */
public class CalculateShapesAreaApp {
    /**
     * Экземпляр класса BufferedReader для чтения потока из консоли
     */
    private BufferedReader brConsole = new BufferedReader(new InputStreamReader(System.in));

    /**
     * Метод для запуска приложения
     */
    public void start(){
        while (true){
            mainMenu();
        }
    }

    /**
     * Главное меню приложения
     */
    private void mainMenu(){
        System.out.println("Программа расчета площадей фигур \n" +
                "Выберите пункт меню:\n" +
                "1. Расчет площади круга\n" +
                "2. Расчет площади квадрата\n" +
                "3. Расчет площади прямоугольника\n" +
                "4. Выход\n");

        try {
            String menuItem = brConsole.readLine();

            switch (menuItem){
                case "1":
                    calculateCircleArea();
                    break;
                case "2":
                    calculateSquareArea();
                    break;
                case "3":
                    calculateRectangleArea();
                    break;
                case "4":
                    exit();
                    break;
                default:
                    System.out.println("Неподдерживаемый пункт меню. Нажмите на Enter...\n");
                    brConsole.readLine();
            }
        }
        catch (IOException e){
            ioExceptionHandler(e);
        }
    }

    /**
     * Меню расчета площади круга
     * @throws IOException
     */
    private void calculateCircleArea() throws IOException {
        System.out.print("Расчет площади круга\n" +
                "Введите радиус круга: ");

        double radius = getDoubleFromConsole();

        Circle circle = new Circle(radius);

        System.out.format("Площадь круга равна: %.3f %n", circle.calculateArea());

        endCalculation();
    }

    /**
     * Меню расчета площади квадрата
     * @throws IOException
     */
    private void calculateSquareArea() throws IOException {
        System.out.print("Расчет площади квадрата\n" +
                "Введите длину стороны квадрата: ");

        double sideLength = getDoubleFromConsole();
        Square square = new Square(sideLength);

        System.out.format("Площадь квадрата равна: %.3f %n", square.calculateArea());

        endCalculation();
    }

    /**
     * Меню расчета площади прямоугольника
     * @throws IOException
     */
    private void calculateRectangleArea() throws IOException {
        System.out.println("Расчет площади прямоугольника");

        System.out.print("Введите ширину прямоугольника: ");
        double width = getDoubleFromConsole();

        System.out.print("Введите высоту прямоугольника: ");
        double height = getDoubleFromConsole();

        Rectangle rectangle = new Rectangle(width, height);
        System.out.format("Площадь прямоугольника равна: %.3f %n", rectangle.calculateArea());

        endCalculation();
    }

    /**
     * Служит для считывания вещественных чисел из консоли
     * @return Считанное вещественное число
     * @throws IOException
     */
    private double getDoubleFromConsole() throws IOException {
        double input = 0;
        boolean isEntered = false;

        while (!isEntered) {
            try {
                input = Double.parseDouble(brConsole.readLine());
                isEntered = true;
            } catch (NumberFormatException e) {
                System.out.print("Неверный формат ввода числа с плавающей точкой!\n" +
                        "Попробуйте ввести значение снова: ");
            }
        }

        return input;
    }

    /**
     * Отображает сообщение обо окончании расчета
     * @throws IOException
     */
    private void endCalculation() throws IOException{
        System.out.println("Расчет закончен. Нажмите на Enter...\n");
        brConsole.readLine();
    }

    /**
     * Реализует выход из программы
     */
    private void exit(){
        System.exit(0);
    }

    /**
     * Обработчик ошибок чтения из консоли. Просто выводит сообщение об ошибке
     * @param e Исключение
     */
    private void ioExceptionHandler(IOException e){
        System.out.println("Ошибка при попытке чтения из консоли: " + e.getMessage());
    }
}
