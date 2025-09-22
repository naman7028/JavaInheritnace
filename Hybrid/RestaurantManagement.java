package Hybrid;

// Superclass
class Person {
    String name;
    int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

// Interface for worker duties
interface Worker {
    void performDuties();
}

// Subclass Chef
class Chef extends Person implements Worker {
    Chef(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is cooking meals.");
    }
}

// Subclass Waiter
class Waiter extends Person implements Worker {
    Waiter(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is serving customers.");
    }
}

// Main class
public class RestaurantManagement {
    public static void main(String[] args) {
        Chef chef = new Chef("Ravi", 101);
        Waiter waiter = new Waiter("Amit", 102);

        chef.displayInfo();
        chef.performDuties();
        System.out.println();

        waiter.displayInfo();
        waiter.performDuties();
    }
}
