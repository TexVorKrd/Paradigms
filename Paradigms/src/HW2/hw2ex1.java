package HW2;

import java.util.Scanner;

public class hw2ex1 {
    public static void main(String[] args) {
        /**
         * Написать скрипт в любой парадигме, который выводит на экран таблицу умножения всех чисел от 1 до n.
         * Обоснуйте выбор парадигм.
         *
         * Условие кривое. Число или цифра? верхняя граница таблицы какая?
         *
         * Конечно процедурный так как переиспользуется.
         */

        System.out.println("Введите число");
        int n = new Scanner(System.in).nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(digs(i));
        }
    }

    public static String digs(int n) {
        if (n < 1) return "";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder
                .append(n)
                .append("\n----------\n");
        for (int i = 1; i <= 9; i++) {
            stringBuilder
                    .append(i)
                    .append("*")
                    .append(n)
                    .append("=")
                    .append(i * n)
                    .append("\n");

        }
        System.out.println();
        stringBuilder
                .append("----------\n");
        return stringBuilder.toString();
    }

}
