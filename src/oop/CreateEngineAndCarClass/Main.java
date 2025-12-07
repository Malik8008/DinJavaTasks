package oop.CreateEngineAndCarClass;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine(150);
        Car car = new Car(engine);
        car.startCar();

    }
}
