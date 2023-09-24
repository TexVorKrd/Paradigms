package HW6;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Поиск искомого элемента в Массиве и вывод его индекса
 */
public class IndexByBinSearch {
    public static void main(String[] args) {
        final int SIZE = (int) (Math.random() * 100);

        int[] intAray = new int[SIZE];
        for (int i = 0; i < SIZE; i++) {
            intAray[i] = (int) ((Math.random() * SIZE));
        }
        Arrays.sort(intAray);
        System.out.println(Arrays.toString(intAray));

        System.out.println("Введите искомы элемент");
        int fElement = new Scanner(System.in).nextInt();
        System.out.println(fElement);

        int tail = 0;
        int head = SIZE - 1;
        int mid;

        int fIndex = -1;
        while (tail <= head && fIndex == -1) {
            mid = (head + tail) / 2;
            if (intAray[mid] == fElement) {
                fIndex = mid;
            } else if (fElement > intAray[mid]) {
                tail = mid + 1;
            } else {
                head = mid - 1;
            }
        }
        System.out.println(fIndex);
    }
}
