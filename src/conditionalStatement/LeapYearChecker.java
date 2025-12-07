package conditionalStatement;

import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        System.out.println("Task Leap Year");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a year: ");
        int x = input.nextInt();
        if((x%4==0 && x%100!=0) || x%400==0){
            System.out.println("The year is a leap year");
        }else  {
            System.out.println("The year is not a leap year");
        }
    }
}
