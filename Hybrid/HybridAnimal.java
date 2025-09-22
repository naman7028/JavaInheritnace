package Hybrid;

class Animal {
    void eat() {
        System.out.println("Animal eats food.");
    }
}

class Dog extends Animal {
    // Only override if behavior needs to change
    @Override
    void eat() {
        System.out.println("Dog eats bones.");
    }
}

class Cat extends Animal {
    // No override since default behavior is sufficient
}

public class HybridAnimal {
    public static void main(String[] args) {
        Animal a = new Animal();
        Dog d = new Dog();
        Cat c = new Cat();

        a.eat();
        d.eat();
        c.eat();
    }
}
