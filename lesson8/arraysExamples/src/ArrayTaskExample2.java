/**
 * Данная программа попросит пользователя ввести 10 целых чисел,
 * потом выведет среднее арифметическое всех не отрицательных чисел.
 * Напоминаю, для нахождения среднего арифметического необходимо знать
 * сумму всех этих чисел и их количество, потом просто 	разделить сумму на количество.
 */

import java.util.Scanner;

public class ArrayTaskExample2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] ar = new int[10];
        // 2 11 1 0 -1 -4 5 6 8 9

        double sum = 0.0;            // Переменная, которая будет обозначать сумму всех не отрицательных чисел
        int schetchik = 0;            // Переменная, которая будет обозначать количество всех не отрицательных чисел

        System.out.println("Введите 10 целых чисел:");
        for (int i = 0; i <= 9; i++)     // Проходимся по каждой ячейке массива и вносим туда свои значение, то есть
            ar[i] = input.nextInt();    // заполняем массив с клавиатуры

        for (int i = 0; i <= 9; i++) {    // Опять проходимся по всем элементам массива
            if (ar[i] >= 0) {           // Проверяем каждый элемент на не отрицательность
                schetchik++;            // Если таковой найдется, щелкаем счетчиком, чтобы считал такие элементы
                sum = sum + ar[i];        // И суммируем их
                System.out.println("index: " + i + "\t" + "value: " + ar[i]);
                System.out.println("sum: " + sum);
                System.out.println("k: " + schetchik);
            }
        }

        // На консоль выведется результат деления суммы на количество, то есть среднее арифметическое
        System.out.print("\nСреднее арифметическое неотрицательных чисел: " + sum / schetchik);
    }
}
