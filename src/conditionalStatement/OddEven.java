package conditionalStatement;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        System.out.println("Task Odd Even");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int x = input.nextInt();
        if (x % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
    }
}
