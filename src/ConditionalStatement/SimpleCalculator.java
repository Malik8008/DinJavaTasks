package ConditionalStatement;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        System.out.println("Task Simple Calculator");
        Scanner a = new Scanner(System.in);
        System.out.print("Please enter a first number: ");
        int x = a.nextInt();
        System.out.print("Please enter a second number: ");
        int y = a.nextInt();
        System.out.println("Please enter operator: (+,-,*,/)");
        char operator = a.next().charAt(0);

        switch (operator) {
            case '+' -> System.out.println("Result: "+(x + y));
            case '-' -> System.out.println("Result: "+(x - y));
            case '*' -> System.out.println("Result: "+(x * y));
            case '/' -> System.out.println("Result: "+(x / y));
        }
    }
}
