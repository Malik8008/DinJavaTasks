package practiceCode;

import java.util.Scanner;

public class MaxThreeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        if (a > b && b > c) {
            System.out.println(a);
        } else if (b > a && a > c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }
}
