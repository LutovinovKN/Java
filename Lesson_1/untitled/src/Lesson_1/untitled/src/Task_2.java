package Lesson_1.untitled.src;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        int i = iScanner.nextInt(); // проверка на int?
        System.out.printf("Факториал числа равно: %d\n", giveMeNumber(i)); // вывод на печать результата
        iScanner.close();
    }

    public static int giveMeNumber(int num) { // функция решения уравнения
        // String[] arrray = i;
        int total = 1;
        for (int i = 1; i < num + 1; i++) {
            total *= i;
        }
        return total;
    }
}
