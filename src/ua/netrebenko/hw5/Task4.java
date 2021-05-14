package ua.netrebenko.hw5;

import ua.netrebenko.hw4.RandIntegers;

import java.util.Arrays;

public class Task4 extends RandIntegers {
    public static void main(String[] args) {
        int size = 5;
        int[] sourceArr = getIntArray(size);
        int[] targetArr = new int[size];
        System.out.println("Initial array: " + Arrays.toString(sourceArr));

        int removedItem = removeItemByIndex(sourceArr, targetArr, 48);
        System.out.println("Modified array: " + Arrays.toString(targetArr));
        System.out.println("Removed item: " + removedItem);
    }

    static int removeItemByIndex(int[] source, int[] target, int index) throws ArrayIndexOutOfBoundsException {
        if (index >= source.length) {
            throw new ArrayIndexOutOfBoundsException();
        }

        for (int i = 0; i < source.length; i++) {
            if (i < index) {
                target[i] = source[i];
            } else if (i > index) {
                target[i - 1] = source[i];
            }
        }

        return source[index];
    }
}
