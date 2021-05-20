package ua.netrebenko.hw7;

public class Aspirant extends Student {
    String thesis;

    public Aspirant(String firstName, String lastName, String group, double averageMark, String thesis) {
        super(firstName, lastName, group, averageMark);
        this.thesis = thesis;
    }

    public int getScholarship() {
        return averageMark == 5 ? 200 : 180;
    }
}
