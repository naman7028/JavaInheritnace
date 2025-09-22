package Hybrid;


class Animal {
    void eat() {
        System.out.println("Animal eats food");
    }
}

class Dog extends Animal {
    @Override
    void eat() {
        System.out.println("Dog eats bones");
    }
    // Avoid overloading 'eat' here to prevent confusion
}

class Cat extends Animal {
    @Override
    void eat() {
        System.out.println("Cat eats fish");
    }
    // Avoid overloading 'eat' here to prevent confusion
}

public class Hybrid {
    public static void main(String[] args) {
        Animal a = new Animal();
        Dog d = new Dog();
        Cat c = new Cat();

        a.eat();
        d.eat();
        c.eat();
    }
}