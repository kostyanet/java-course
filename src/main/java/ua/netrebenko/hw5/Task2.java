package ua.netrebenko.hw5;

import ua.netrebenko.hw4.RandIntegers;

import java.util.Arrays;

public class Task2 extends RandIntegers {
    public static void main(String[] args) {
        int[] arr = getIntArray(3);
        System.out.println(Arrays.toString(arr));
        System.out.println("Array is disordered: " + !isSorted(arr));
    }

    static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }

        return true;
    }
}
