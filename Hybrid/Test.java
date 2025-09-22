package Hybrid;

class Base {
    public void display() {
        System.out.println("Base class method");
    }
}

// Subclass 1
class DerivedA extends Base {
    public void showA() {
        System.out.println("DerivedA class method");
    }
}

// Subclass 2
class DerivedB extends Base {
    public void showB() {
        System.out.println("DerivedB class method");
    }
}

// Hybrid Inheritance via interfaces
interface Extra {
    void extraMethod();
}

class HybridDerived extends DerivedA implements Extra {
    public void extraMethod() {
        System.out.println("HybridDerived implements Extra");
    }
    public void showHybrid() {
        System.out.println("HybridDerived class method");
    }
}

class Test {
    public static void main(String[] args) {
        HybridDerived obj = new HybridDerived();
        obj.display();
        obj.showA();
        obj.extraMethod();
        obj.showHybrid();
    }
}
