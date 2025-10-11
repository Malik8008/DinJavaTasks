package ConditionalStatement;

import java.util.Scanner;

public class DiscountSystem {
    public static void main(String[] args) {
        System.out.println("Task Discount System");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the price of the item: ");
        int x = input.nextInt();
        int discountPrice = 0;
        if (x > 0) {
            if (x >= 1000) {
                discountPrice += x - ((x * 20) / 100);
                System.out.println("The discounted price is: " + discountPrice);
            } else if (x >= 500) {
                discountPrice += x - ((x * 10) / 100);
                System.out.println("The discounted price is: " + discountPrice);

            }else{
                System.out.println("The price without discount price is: "+x);
            }
        }else {
            System.out.println("Invalid Input");
        }
    }
}
