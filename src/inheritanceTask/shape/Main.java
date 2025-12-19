package inheritanceTask.shape;

public class Main {
    public static void main(String[] args) {
        System.out.print("Please enter the radius of the circle:");
        Shape circle = new Circle();
        circle.area();
        System.out.print("Please enter the side of the square:");
        Shape square = new Square();
        square.area();
    }
}
