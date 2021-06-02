package ua.netrebenko.hw5;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int size = 5;
        int[][] arr = new int[size][size];
        System.out.println(Arrays.deepToString(fillArrayIn(arr, size)));
    }

    static int[][] fillArrayIn(int[][] arr, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arr[i][j] = i % 2 != 0 ? -j : j;
            }
        }

        return arr;
    }
}
