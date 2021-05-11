package ua.netrebenko.hw4;

import java.util.Random;

public class Task1 extends RandIntegers {
    public static void main(String[] args) {
        int[] numbers = getIntArray(400);
        System.out.println("Average: " + calcAvg(numbers));
        System.out.println("Geometrical average: " + calcGeomAvg(numbers));
    }

    private static double calcAvg(int[] numbers) {
        long sum = 0;
        for (int x : numbers) {
            sum += x;
        }

        return sum / numbers.length;
    }

    private static double calcGeomAvg(int[] numbers) {
        long product = 1;
        for (int x : numbers) {
            product *= x;
            System.out.println(product);
        }

        return Math.pow(product, -numbers.length);
    }
}
