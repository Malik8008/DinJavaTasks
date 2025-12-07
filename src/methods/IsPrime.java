package methods;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = input.nextInt();
        isPrime(number);
    }

    public static void isPrime(int number) {
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
