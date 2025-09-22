package Hybrid;
class SuperClass {
    // Minimized public fields; use private/protected instead
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

public class Super extends SuperClass {
    // Minimized public fields; use private/protected instead
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
