package ua.netrebenko.hw3;

import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        startGaming();
    }

    private static void startGaming() {
        int rand = new Random().nextInt(10);
        System.out.println("Guess a number. Hint: " + rand);
        runGame(rand);
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
