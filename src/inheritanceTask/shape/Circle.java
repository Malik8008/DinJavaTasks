package inheritanceTask.shape;

import java.util.Scanner;

public class Circle extends Shape {
    Scanner sc = new Scanner(System.in);
    int radius = sc.nextInt();
    double pi= 3.14;

    @Override
    void area(){
        System.out.println("The area of the circle is: "+(pi*(radius*radius)));
    }
}
