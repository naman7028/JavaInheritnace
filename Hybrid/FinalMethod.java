package Hybrid;
class SuperClass {
    // Critical method that should not be overridden
    public final void criticalMethod() {
        System.out.println("Critical functionality");
    }

    // Non-critical method
    public void normalMethod() {
        System.out.println("Normal functionality");
    }
}

class SubClass extends SuperClass {
    // Attempting to override criticalMethod() will result in a compilation error
    @Override
    public void normalMethod() {
        System.out.println("Overridden normal functionality");
    }
}

public class FinalMethod {
    public static void main(String[] args) {
        SubClass obj = new SubClass();
        obj.criticalMethod(); // Calls the final method from SuperClass
        obj.normalMethod();   // Calls the overridden method from SubClass
    }
}