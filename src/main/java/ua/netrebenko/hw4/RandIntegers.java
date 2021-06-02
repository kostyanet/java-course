package ua.netrebenko.hw4;

import java.util.Random;

public class RandIntegers {
    public static int[] getIntArray(int size) {
        Random generator = new Random();
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = generator.nextInt();
        }

        return numbers;
    }

    public static boolean isPrime(int x) {
        int temp;

        for (int i = 2; i <= x / 2; i++) {
            temp = x % i;
            if (temp == 0) return false;
        }
        return true;
    }
}
