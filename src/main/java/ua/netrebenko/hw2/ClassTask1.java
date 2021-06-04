package ua.netrebenko.hw2;

import java.util.Scanner;

public class ClassTask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstValue = scanner.nextInt();
        int secondValue = scanner.nextInt();

        if (isEven(firstValue) && isEven(secondValue)) {
            System.out.println("Both");
        } else if (isEven(firstValue)) {
            System.out.println(firstValue);
        } else if (isEven(secondValue)) {
            System.out.println(secondValue);
        } else {
            System.out.println("None");
        }
    }

    private static boolean isEven(int x) {
        return x % 2 == 0;
    }

}
