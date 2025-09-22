package Hybrid;

class Animal {
    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woof!");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow!");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Animal[] animals = { new Dog(), new Cat() };
        for (Animal animal : animals) {
            animal.makeSound(); // Polymorphism in action
        }
    }
}