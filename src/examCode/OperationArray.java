package examCode;

import java.util.Scanner;

public class OperationArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            };
            if (arr[i] < min) {
                min = arr[i];
            };
            sum += arr[i];
        }

        double average = sum / arr.length;
        System.out.println("The maximum value is " + max);
        System.out.println("The minimum value is " + min);
        System.out.println("The average value is " + average);
    }
}
