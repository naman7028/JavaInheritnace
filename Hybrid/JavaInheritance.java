package Hybrid;

// Superclass
public class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public String speak() {
        return "Some generic sound";
    }

    public String getName() {
        return name;
    }
}

// Subclass
public class Dog extends Animal {
    private String breed;

    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    @Override
    public String speak() {
        return "Woof!";
    }

    public String getBreed() {
        return breed;
    }
}
// Subclass
public class Cat extends Animal {
    private String color;

    public Cat(String name, String color) {
        super(name);
        this.color = color;
    }

    @Override
    public String speak() {
        return "Meow!";
    }

    public String getColor() {
        return color;
    }
}       
// Main class to demonstrate inheritance
public class JavaInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", "Golden Retriever");
        Cat cat = new Cat("Whiskers", "Tabby");

        System.out.println(dog.getName() + " the " + dog.getBreed() + " says: " + dog.speak());
        System.out.println(cat.getName() + " the " + cat.getColor() + " cat says: " + cat.speak());
    }
}