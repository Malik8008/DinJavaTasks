package examCode2.taskArea;

import inheritanceTask.shape.Square;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Circle(5, 3.14);
        shape.area();
        Shape shape1 = new Rectangle(8, 5);
        shape1.area();

    }
}
