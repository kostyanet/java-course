package ua.netrebenko.hw4;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

    }

    public static int[] getIntArray(int size) {
        Random generator = new Random();
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = generator.nextInt();
        }
    }

    private static double calcAvg() {
        return Math.;
    }

    private static void runGame(int a) {
        do {
            System.out.println("Enter a number between 0 and 10");
            Scanner scanner = new Scanner(System.in);
            int b = scanner.nextInt();

            if (b == a) {
                System.out.println("You won!");
                break;
            } else if (b < a) {
                System.out.println("Not enough");
            } else {
                System.out.println("Too much");
            }
        } while (true);
    }
}
