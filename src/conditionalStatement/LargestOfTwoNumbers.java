package conditionalStatement;

import java.util.Scanner;

public class LargestOfTwoNumbers {
    public static void main(String[] args) {
        System.out.println("Task Largest Of Two Numbers");
        Scanner a = new Scanner(System.in);
        System.out.print("Please enter a first number: ");
        int x = a.nextInt();
        System.out.print("Please enter a second number: ");
        int y = a.nextInt();
        if (x > y) {
            System.out.println("result: " + (x + " > " + y));
        } else if (x < y) {
            System.out.println("result: " + (x + " < " + y));
        }else  {
            System.out.println("result: " + (x + " == " + y));
        }
    }
}
