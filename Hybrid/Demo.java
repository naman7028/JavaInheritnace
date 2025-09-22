package Hybrid;

// Demonstrating proper "is-a" relationship in hybrid inheritance

class Animal {
    void eat() {
        System.out.println("Animal eats food.");
    }
}

class Mammal extends Animal {
    void walk() {
        System.out.println("Mammal walks.");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println("Bird flies.");
    }
}

interface Flyer {
    void fly();
}

class Bat extends Mammal implements Flyer {
    public void fly() {
        System.out.println("Bat flies.");
    }
}

public class Demo {
    public static void main(String[] args) {
        Bat bat = new Bat();
        bat.eat();   // Inherited from Animal
        bat.walk();  // Inherited from Mammal
        bat.fly();   // Implemented from Flyer
    }
}