package ua.netrebenko.module1;

import java.util.Scanner;

/**
 * Ход коня по шахматной доске.
 * Вводится текущее положение коня и клетка в которую пробуют его передвинуть за 1 ход.
 * Программа должна проверить, возможно ли это сделать.
 */
public class Task2 {
    private final static String X = "ABCDEFGH";
    private final static String Y = "12345678";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter current position:");
        String current = input.nextLine();
        System.out.println("Enter next position:");
        String next = input.nextLine();

        System.out.println("Is next position valid: " + isStepValid(current, next));
    }

    static boolean isStepValid(String currentCell, String nextCell) {
        String current = currentCell.toUpperCase();
        String next = nextCell.toUpperCase();

        int xDiff = getDiff(current.charAt(0), next.charAt(0), Task2.X);
        int yDiff = getDiff(current.charAt(1), next.charAt(1), Task2.Y);

        return (xDiff == 2 && yDiff == 1) || (xDiff == 1 && yDiff == 2);
    }

    static int getDiff(char current, char next, String reference) {
        return Math.abs(reference.indexOf(current) - reference.indexOf(next));
    }
}
