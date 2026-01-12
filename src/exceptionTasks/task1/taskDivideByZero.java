package exceptionTasks.task1;

import java.util.Scanner;

public class taskDivideByZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Please enter first number: ");
            int a = sc.nextInt();
            System.out.print("Please enter second number: ");
            int b = sc.nextInt();
            int result = a / b;
            System.out.print("Result: ");
            System.out.println(result);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
