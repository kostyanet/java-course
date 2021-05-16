package ua.netrebenko.hw6;

public class Task1 {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone();
        Phone phone3 = new Phone();

        phone1.number = 123;
        phone1.model = "Any 1";
        phone1.weight = 250;

        phone2.number = 456;
        phone2.model = "Any 2";
        phone2.weight = 250;

        phone3.number = 789;
        phone3.model = "Any 3";
        phone3.weight = 200;

        System.out.println("Phone " + phone1.model + ". Number " + phone1.number + ". Weight " + phone1.weight + ".");
        System.out.println("Phone " + phone2.model + ". Number " + phone2.number + ". Weight " + phone2.weight + ".");
        System.out.println("Phone " + phone3.model + ". Number " + phone3.number + ". Weight " + phone3.weight + ".");
    }
}
