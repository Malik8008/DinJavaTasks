package loops;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = input.nextInt();
        int sum=0;
        while (number != 0){
            sum+=number;
            number=number-1;
        }
        System.out.print(sum);
    }
}
