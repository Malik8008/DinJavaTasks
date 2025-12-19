package inheritanceTask.shape;

import java.util.Scanner;

public class Square extends Shape {
    Scanner sc = new Scanner(System.in);
    double side=sc.nextDouble();
    @Override
    void area(){
        System.out.println("The area of the square is: "+(side*side));
    }
}
