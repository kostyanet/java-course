package ua.netrebenko.hw17additional;

import java.time.Year;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Дана коллекция лет (java.time.Year). Вернуть високосные годы в виде списка, отсортированного по возрастанию.
 */
public class Task2 {
    public static void main(String[] args) {
        Year[] years = new Year[60];
        for (int i = 0; i < years.length; i++) {
            years[i] = Year.of(1992 - i);
        }

        List<Integer> leapYears = Arrays
                .stream(years)
                .filter(Year::isLeap)
                .sorted(Year::compareTo)
                .map(Year::getValue)
                .collect(Collectors.toList());

        System.out.println(leapYears.toString());
    }
}
