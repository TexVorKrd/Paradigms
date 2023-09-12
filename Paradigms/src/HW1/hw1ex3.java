package HW1;

import java.util.Arrays;

public class hw1ex3 {
    public static void main(String[] args) {
        /**
         * Дан список целых чисел numbers. Необходимо написать в императивном стиле процедуру для
         * сортировки числа в списке в порядке убывания. Можно использовать любой алгоритм сортировки.
         */

        int[] array1 = {1, 4, 7, 2, 0, 3, 5, 9};
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(sort_list_declarative(array1)));

        int[] array2 = {8, 1, 5, 9, 23, 12, 8};
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(sort_list_imperative(array2)));
    }

    public static int[] sort_list_imperative(int[] array) {

        int i = 0;
        boolean isNotSort = true;
        while (i < array.length - 1 && isNotSort) {
            boolean wasSwitch = false;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    wasSwitch = true;
                }
            }
            if (!wasSwitch) isNotSort = false;
            i++;
        }
        return array;
    }

    public static int[] sort_list_declarative(int[] array) {
        Arrays.sort(array);
        return array;
    }
}
