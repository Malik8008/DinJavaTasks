package ConditionalStatement;

import java.util.Scanner;

public class LargestOfThreeNumbers {
    public static void main(String[] args) {
        System.out.println("Task Largest Of Three Numbers");
        Scanner a = new Scanner(System.in);
        System.out.print("Please enter a first number: ");
        int x = a.nextInt();
        System.out.print("Please enter a second number: ");
        int y = a.nextInt();
        System.out.print("Please enter a third number: ");
        int z = a.nextInt();
        if (x >= y && x >= z) {
            System.out.println("The largest number is: " + x);
        } else if (x <= y && y >= z) {
            System.out.println("The largest number is: "+y);
        } else {
            System.out.println("The largest number is: "+z);
        }
    }
}
