package ua.netrebenko.hw5;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int size = 5;
        int[][] arr = new int[size][size];

        fillArrayIn(arr, size);
        System.out.println("Initial array: " + Arrays.deepToString(arr));

        int[][] arrCopy = copy(arr, size);
        System.out.println("Swapped array: " + Arrays.deepToString(swapRowCol(arr, arrCopy, size)));
    }

    static void fillArrayIn(int[][] arr, int size) {
        Random generator = new Random();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arr[i][j] = generator.nextInt(100);
            }
        }

    }

    static int[][] copy(int[][] source, int size) {
        int[][] target = new int[size][size];

        for (int i = 0; i < size; i++) {
            System.arraycopy(source[i], 0, target[i], 0, size);
        }

        return target;
    }

    static int[][] swapRowCol(int[][] source, int[][] target, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                target[i][j] = source[j][i];
            }
        }

        return target;
    }
}
