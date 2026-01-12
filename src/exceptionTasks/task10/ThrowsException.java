package exceptionTasks.task10;

import exceptionTasks.task8.InvalidAgeException;

import java.util.Scanner;

public class ThrowsException {
    public static void main(String[] args) throws InvalidAgeException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter your age: ");
        int age = sc.nextInt();
        if (age < 18) {
            throw new InvalidAgeException("Don't your access this platform");
        }
        enterAge(age);
    }

    public static void enterAge(int age) {
        System.out.println(age);
    }
}
