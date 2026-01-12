package exceptionTasks.task7;

import java.util.Scanner;

public class ValidationTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Please enter your age: ");
            int age = sc.nextInt();
            if (age<0 || age>120){
                throw new IllegalArgumentException("Age must not be negative or greater than 120");
            }
            enterAge(age);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
    public static void enterAge(int age){
        System.out.println(age);
    }
}
