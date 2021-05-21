package ua.netrebenko.cw7;

public class Vet {
    public static void main(String[] args) {
        Animal[] zoo = {
                new Dog("Grass", "Street", "Bobique"),
                new Dog("Berries", "Home", "Rexx"),
                new Cat("Chips", "Neibour", "Murka")
        };

        Vet vet = new Vet();

        for (Animal a : zoo) {
            vet.treatAnimal(a);
        }
    }

    void treatAnimal(Animal animal) {
        System.out.println(animal.getDescription());
    }
}
