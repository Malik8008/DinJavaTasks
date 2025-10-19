package Methods;

import java.util.Scanner;

public class FindArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of square: ");
        int side = sc.nextInt();
        System.out.println("result: " + area(side));
        System.out.print("Enter the length of rectangle: ");
        int length = sc.nextInt();
        System.out.print("Enter the width of rectangle: ");
        int  width = sc.nextInt();
        System.out.println("result: " + area(length,width));

    }

    public static int area(int side) {
        return (side * side);
    }

    public static int area(int length, int width) {
        return (length * width);
    }
}
