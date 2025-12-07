package conditionalStatement;

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        System.out.println("Task PositiveNegative");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int y = input.nextInt();
        if (y > 0) {
            System.out.println("the number is positive");
        } else if (y < 0) {
            System.out.println("the number is negative");
        } else {
            System.out.println("the number is zero");
        }
    }
}

