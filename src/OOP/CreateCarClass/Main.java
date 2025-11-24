package OOP.CreateCarClass;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.brand = "BMW";
        car.model = "G20";
        car.year = 2020;
        System.out.println(car.brand + "\n" + car.model + "\n" + car.year);
    }
}
