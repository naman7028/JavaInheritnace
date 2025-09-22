package Hybrid;

class Animal {
    Animal() {
        System.out.println("Animal constructor called");
    }

    // Avoid calling non-final methods from constructors
    public final void displayType() {
        System.out.println("I am an animal");
    }
}

class Dog extends Animal {
    Dog() {
        super(); // Explicitly call superclass constructor
        System.out.println("Dog constructor called");
    }
}

class Cat extends Animal {
    Cat() {
        super(); // Explicitly call superclass constructor
        System.out.println("Cat constructor called");
    }
}

public class Animal15 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.displayType();

        Cat cat = new Cat();
        cat.displayType();
    }
}
