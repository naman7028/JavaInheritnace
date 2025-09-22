package Hybrid;

class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Mammal extends Animal {
    void walk() {
        System.out.println("Mammal walks");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println("Bird flies");
    }
}

class Bat extends Mammal {
    void hang() {
        System.out.println("Bat hangs upside down");
    }
}

class Ostrich extends Bird {
    void run() {
        System.out.println("Ostrich runs");
    }
}

public class HybridInheritanceAnimal {
    public static void main(String[] args) {
        Bat bat = new Bat();
        bat.eat();
        bat.walk();
        bat.hang();

        Ostrich ostrich = new Ostrich();
        ostrich.eat();
        ostrich.fly();
        ostrich.run();
    }
}