package HW1;

public class hw1ex2 {
    public static void main(String[] args) {
        /**
         *  У вас есть массив, содержащий числа от 1 до N, где N - длина массива.
         *  Одно из чисел в массиве повторяется дважды, а одно число пропущено.
         *  Найдите повторяющееся число и пропущенное число.
         */

        int[] array = {2, 3, 1, 5, 3};
        int repeatDig = 0;
        int missDig = 0;

        int[] testArray = new int[array.length + 1];

        for (int j : array) {
            testArray[j] += j;
        }

        for (int i = 1; i < testArray.length; i++) {
            if (testArray[i] == 0) missDig = i;
            if (testArray[i] > i) repeatDig = i;
        }

        System.out.println("Пропущено число " + missDig);
        System.out.println("Повторяется число " + repeatDig);
    }
}
