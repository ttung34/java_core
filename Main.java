class Engine {
    public void start() {
        System.out.println("Engine starts.");
    }
}

class Car {
    private Engine engines;

    public Car(Engine engines) {
        this.engines = engines; // Car phụ thuộc vào Engine
    }

    public void drive() {
        engines.start(); // Car "can do" driving nhờ Engine
        System.out.println("Car is driving.");
    }
}

public class Main {
    public static void main(String[] args) {
        Engine engines = new Engine();
        Car car = new Car(engines);
        car.drive();
    }
}