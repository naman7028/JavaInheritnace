package Hybrid;

class Engine {
    public void start() {
        System.out.println("Engine started.");
    }
}

class Car {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void drive() {
        engine.start();
        System.out.println("Car is driving.");
    }
}

public class MainCar {
    public static void main(String[] args) {
        Engine engine = new Engine();
        Car car = new Car(engine);
        car.drive();
    }
}
