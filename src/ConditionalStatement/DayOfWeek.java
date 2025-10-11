package ConditionalStatement;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        System.out.println("Task Day of Week");
        Scanner a = new Scanner(System.in);
        System.out.print("Please enter a  number: ");
        int x = a.nextInt();
        switch (x) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid Input");
        }
    }
}
