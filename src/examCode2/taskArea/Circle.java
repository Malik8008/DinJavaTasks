package examCode2.taskArea;

public class Circle extends Shape {
    private double radius;
    private double pi;

    public Circle(double radius, double pi){
        this.radius = radius;
        this.pi = pi;
    }

    @Override
    public void area() {
        System.out.println("Area of Circle: " + (this.radius * this.pi));
    }
}
