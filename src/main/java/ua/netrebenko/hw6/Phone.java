package ua.netrebenko.hw6;

public class Phone {
    int number = -1;
    String model = "";
    short weight = -1;

    Phone(int number, String model, short weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    Phone() {}

    void receiveCall(String name) {
        System.out.println(name + " is calling.");
    }

    int getNumber() {
        return this.number;
    }
}
