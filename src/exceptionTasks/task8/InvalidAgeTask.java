package exceptionTasks.task8;

import java.util.Scanner;

public class InvalidAgeTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Please enter your age: ");
            int age = sc.nextInt();
            if (age < 18) {
                throw new InvalidAgeException("Don't your access this platform");
            }
            enterAge(age);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void enterAge(int age) {
        System.out.println(age);
    }
}
