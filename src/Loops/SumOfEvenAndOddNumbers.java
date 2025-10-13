package Loops;

import java.util.Scanner;

public class SumOfEvenAndOddNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = input.nextInt();
        int sumEven = 0;
        for (int i = 0; i < number; i++) {
            if (i % 2 == 0) {
                sumEven+=i;
            }
        }
        System.out.println("The sum is even number: " + sumEven);

        int sumOdd = 0;
        for (int i = 0; i < number; i++) {
            if (i % 2 != 0) {
                sumOdd+=i;
            }
        }
        System.out.println("The sum is odd number: " + sumOdd);
    }
}
