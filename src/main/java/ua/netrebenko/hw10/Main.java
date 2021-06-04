package ua.netrebenko.hw10;

public class Main {

    public static void main(String[] args) {
        Report report = Report.builder().header("Header").body("Body").build();
        Report report1 = report.toBuilder().footer("Footer").build();

        System.out.println(report.toString());
        System.out.println(report1.toString());
    }
}
