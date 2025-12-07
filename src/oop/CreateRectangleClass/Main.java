package oop.CreateRectangleClass;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5,3);
        System.out.println("The area of the rectangle is: " + rectangle.getArea());
        System.out.println("The perimeter of the rectangle is: " + rectangle.getPerimeter());
    }
}
