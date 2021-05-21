package ua.netrebenko.module1;

import java.util.Arrays;

/**
 * Найти количество различных элементов массива. Пример: для 1 4 5 1 1 3 ответ 4.
 * *Создать метод, который принимает массив и возвращает количество
 */
public class Task1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 7, 4, 2, 9, 1, 0};
        System.out.println("Amount of unique numbers is " + countUniqueNumbers(array));
    }

    static int countUniqueNumbers(int[] array) {
        int pointer = 0;
        int[] listOfUniqueNumbers = new int[array.length];

        for (int item : array) {
            if (!arrayContains(item, listOfUniqueNumbers)) {
                listOfUniqueNumbers[pointer] = item;
                pointer++;
            }
        }

        return pointer - 1;
    }

    static boolean arrayContains(int item, int[] array) {
        return Arrays.binarySearch(array, item) >= 0;
    }
}
