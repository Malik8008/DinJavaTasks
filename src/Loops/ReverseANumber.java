package Loops;

import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = input.nextInt(); //12
        int a=0;
        int reverseNum=0;
        while(number != 0){
            a=number%10;  //2
            reverseNum=reverseNum*10+a; //2
            number=number/10;  //1
        }
        System.out.println("Result: " + reverseNum);
    }
}
