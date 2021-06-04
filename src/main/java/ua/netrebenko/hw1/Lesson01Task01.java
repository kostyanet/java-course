package ua.netrebenko.hw1;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Lesson01Task01 {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        String dateTimeString = dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
        System.out.println("Kostya Net. Printed at " + dateTimeString);
    }
}
