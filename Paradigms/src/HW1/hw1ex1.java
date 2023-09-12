package HW1;

import java.util.Arrays;

public class hw1ex1 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        /**
         * У вас есть массив целых чисел,
         * в котором каждое число, кроме одного, повторяется дважды.
         * Вам нужно найти это одиночное число.
         * Входной массив: [4, 3, 2, 4, 1, 3, 2]
         * Результат: 1
         */
        int[] array = {4, 3, 2, 4, 1, 3, 2};
        System.out.println(Arrays.toString(array));

        singleBySet(array);
        handWrite(array);
    }

    /**
     * Решение через стрим.
     * Загоняем массив в стрим, удаляем повторы
     * Умножаем на 2 и вычитае сумму элементов первоночального массива.
     *
     * @param array - целочисленый массив
     */
    public static void singleBySet(int[] array) {

        int element = Arrays.stream(array).distinct().sum() * 2 - Arrays.stream(array).sum();

        System.out.println("Реализация через стрим. Уникальны элемент " + element);
    }

    /**
     * Реализация через while и флаги чтобы не использовать break как антипатерн
     * Так как значения произвольные решать через индекс массива нерационально
     *
     * @param array
     */
    public static void handWrite(int[] array) {

        boolean isFindSingleElement = false;
        int i = 0;
        int element = 0;
        while (!isFindSingleElement && i < array.length - 1) {
            element = array[i];
            boolean isInArrayFinde = false;
            int j = 0;
            while (!isInArrayFinde && j < array.length) {
                if (element == array[j] && i != j) isInArrayFinde = true;
                j++;
            }
            if (!isInArrayFinde) isFindSingleElement = true;
            i++;
        }
        System.out.printf("Реализация самописная. Уникальны элемент " + element);
    }
}
