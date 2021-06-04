package ua.netrebenko.hw4;

import java.util.Arrays;

public class Task4 extends RandIntegers {
    public static void main(String[] args) {
        int[] numbers = getIntArray(1000);
        System.out.println("Resulting array: " + Arrays.toString(replaceZeros(numbers)));
    }

    public static int[] replaceZeros(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0)
                numbers[i] = 0;
        }

        return numbers;
    }
}
