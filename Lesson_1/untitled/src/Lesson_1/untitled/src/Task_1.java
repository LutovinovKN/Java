package Lesson_1.untitled.src; // В какой папке находимся

import java.util.Scanner; // возможность ввода пользователем данных

public class Task_1 { // класс всегда должен быть с тем же именем, что и название файла

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        int i = iScanner.nextInt(); // проверка на int?
        System.out.printf("Треугольное число равно: %d\n", giveMeNumber(i)); // вывод на печать результата
        iScanner.close();
    }

    public static int giveMeNumber(int num) { // функция решения уравнения
        return (num * (num + 1)) / 2;
    }
}