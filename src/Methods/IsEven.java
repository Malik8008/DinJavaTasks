package Methods;

import java.util.Scanner;

public class IsEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.println(isEven(n));
    }


    public static boolean isEven(int a){
        if(a%2==0){
            return true;
        }
        return false;
    }
}
