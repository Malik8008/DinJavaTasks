package OOP.CreateEngineAndCarClass;

public class Engine {
    int horsePower;

    public Engine(int horsePower) {
        this.horsePower = horsePower;
    }

    public void startEngine(){
        System.out.println("Engine is starting with this horse power: " + horsePower+"HP");
    }
}
