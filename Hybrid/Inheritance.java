package Hybrid;

class Parent {
    void show() {
        System.out.println("Parent show()");
    }
}

class Child extends Parent {
    @Override
    void show() {
        System.out.println("Child show()");
    }
}

class GrandChild extends Child {
    @Override
    void show() {
        System.out.println("GrandChild show()");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.show(); // Output: Parent show()

        Child c = new Child();
        c.show(); // Output: Child show()

        GrandChild gc = new GrandChild();
        gc.show(); // Output: GrandChild show()

        // Demonstrating polymorphism
        Parent pc = new Child();
        pc.show(); // Output: Child show()

        Parent pgc = new GrandChild();
        pgc.show(); // Output: GrandChild show()
    }
}