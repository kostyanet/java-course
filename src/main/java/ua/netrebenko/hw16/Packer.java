package ua.netrebenko.hw16;

/**
 * Доступен класс Packer, но он разработан с нарушением бизнес-логики и
 * не имеет реализации. Исправьте код упаковщика, чтобы:
 * ● Любой вид хлебобулочных изделий (Bakery) можно упаковать в
 * коробку с более базовым типом (например, из коробки с пирогом
 * (Pie) в коробку с едой (Food))
 * ● Базовые вещи, такие как еда (Food), нельзя упаковать в узкие
 * коробки (например, с пирожными (Cake))
 * ● Произвольные классы, такие как String или Object, не могут быть
 * перепакованы без ошибок или предупреждений во время
 * компиляции
 * ● Переупаковка на самом деле происходит
 */

public class Packer {
    public static void main(String[] args) {
        Packer packer = new Packer();
        Box<Food> foodBox = new Box<>();
        Box<Cake> cakeBox = new Box<>();
        packer.repackage(foodBox, cakeBox);

        Box<Food> foodBox1 = new Box<>();
        Box<Pie> pieBox = new Box<>();
        packer.repackage(foodBox1, pieBox);

//        Won't compile
//        Box<Food> foodBox2 = new Box<>();
//        Box<Pie> pieBox2 = new Box<>();
//        packer.repackage(pieBox2, foodBox2);

//        Won't compile
//        Box<Food> foodBox3 = new Box<>();
//        Box<String> stringBox = new Box<>();
//        packer.repackage(foodBox3, stringBox);

    }

    public void repackage(Box<Food> to, Box<? extends Food> from) {
        to.put(from.get());
    }
}

class Box<T> {
    private T item;

    public void put(T item) {
        this.item = item;
    }

    public T get() {
        return this.item;
    }
}

class Goods {
}

class Food extends Goods {
}

class Bakery extends Food {
}

class Cake extends Bakery {
}

class Pie extends Bakery {
}

class Tart extends Bakery {
}
