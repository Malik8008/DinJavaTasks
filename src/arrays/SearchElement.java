package arrays;

import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number you want to search: ");
        int num = sc.nextInt();
        int[] nums = {13, 25, 45, 34, 67, 122};
        for (int n : nums) {
            if (n == num) {
                System.out.println(n + " is present in the array");
            }
        }
        System.out.println("is not present in the array");
    }
}
