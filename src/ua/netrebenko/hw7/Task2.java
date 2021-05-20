package ua.netrebenko.hw7;

public class Task2 {
    public static void main(String[] args) {
        Student student1 = new Aspirant("Ivan", "Dub", "XYZ-1", 4.8, "Falsehood of Darvin's theory");
        Student student2 = new Student("Nick", "Guk", "XYZ-1", 5);
        Aspirant student3 = new Aspirant("Paul", "Kot", "XYZ-1", 4.3, "Falsehood of Lenin's theory");

        Student[] group = {student1, student2, student3};

        for (Student s : group) {
            System.out.println(s.getFullName() + " has got scholarship of " + s.getScholarship() + " UAH");
        }
    }
}
