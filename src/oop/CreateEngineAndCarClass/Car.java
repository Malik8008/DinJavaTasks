package oop.CreateEngineAndCarClass;

public class Car{
    Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void startCar() {
        engine.startEngine();
    }
}
