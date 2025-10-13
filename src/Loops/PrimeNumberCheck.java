package Loops;

import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        //I asked for help from ChatGpt for this task
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = input.nextInt();
        if (number <= 1) {
            System.out.println(number + " is not prime number.");
        } else if (number == 2) {
            System.out.println(number + " is prime number.");
        } else {
            boolean isPrime = true;
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                System.out.println(number + " is prime number.");
            } else {
                System.out.println(number + " is not prime number.");
            }
        }
    }
}
