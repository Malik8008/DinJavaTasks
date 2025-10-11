package ConditionalStatement;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        System.out.println("Task Grade");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number between 0 and 100: ");
        byte x = input.nextByte();
        if (x < 0 || x > 100) {
            System.out.println("Invalid Input");
        } else if (x >= 90) {
            System.out.println("A");
        } else if (x >= 80) {
            System.out.println("B");
        } else if (x >= 70) {
            System.out.println("C");
        }else if (x >= 60) {
            System.out.println("D");
        }else {
            System.out.println("F");
        }
    }
}
