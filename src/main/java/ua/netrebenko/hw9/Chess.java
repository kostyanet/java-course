package ua.netrebenko.hw9;

import java.util.Scanner;

/**
 * Ход коня по шахматной доске.
 * Вводится текущее положение коня и клетка в которую пробуют его передвинуть за 1 ход.
 * Программа должна проверить, возможно ли это сделать.
 */
public class Chess {
    CoordinatesConverter converter = new CoordinatesConverter();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter current position:");
        String current = input.nextLine();
        System.out.println("Enter next position:");
        String next = input.nextLine();

        Chess game = new Chess();
        System.out.println("Is next position valid: " + game.isStepValid(current, next));
    }

    public Chess() {}

    public Chess(CoordinatesConverter converter) {
        this.converter = converter;
    }

    boolean isStepValid(String currentCell, String nextCell) {
        converter.setCoordinates(currentCell, nextCell);
        int xDiff = converter.getXDiff();
        int yDiff = converter.getYDiff();

        return (xDiff == 2 && yDiff == 1) || (xDiff == 1 && yDiff == 2);
    }
}
