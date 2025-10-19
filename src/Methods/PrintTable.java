package Methods;

import java.util.Scanner;

public class PrintTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = input.nextInt();
        printTable(number);
    }

    public static void printTable(int num){
        for (int i = 1; i <= 10; i++) {
            System.out.println(num*i);
        }
    }
}
